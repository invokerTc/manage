package com.ruirui;

import com.ruirui.bean.Dept;
import com.ruirui.bean.Staff;
import com.ruirui.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.*;

/**
 * Created by Administrator on 2018/2/5.
 */
public class TestDemo {

    private static SessionFactory sessionFactory;
    private Session session;

    @BeforeClass
    public static void init(){
       Configuration configure = new Configuration().configure();
        sessionFactory = configure.buildSessionFactory();
    }
    @AfterClass
    public static void destroy(){
        sessionFactory.close();
    }
    @Before
    public void openSession(){
        session = sessionFactory.openSession();
    }
    @After
    public void closeSession(){
        session.close();
    }

    @Test
    public void testInit(){
        Dept dept = session.get(Dept.class, 1);
        System.out.println(dept.getDeptName());
    }
    @Test
    public void testAdd(){
        session.beginTransaction();
        Dept dept = new Dept();
        dept.setDeptName("运营中心");
        Staff staff = new Staff();
        staff.setStaffName("李伟");
        staff.setDept(dept);
        dept.getStaffSet().add(staff);
        session.save(staff);
        session.save(dept);
    }
    @Test
    public void testQuery(){
        Staff staff = session.get(Staff.class, 1);
        System.out.println(staff);
    }
    @Test
    public void testQuery1(){
        Student student = session.get(Student.class, 1);
        System.out.println(student);
    }
    @Test
    public void testAddStu(){
        Student student = new Student();
        student.setStuAge((byte) 25);
        student.setStuName("龙锦");
        student.setStuCourse("音乐");
        student.setStuScore(89);
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }
}
