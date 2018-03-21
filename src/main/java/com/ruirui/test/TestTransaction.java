package com.ruirui.test;

import com.ruirui.HibernateSessionFactory;
import com.ruirui.bean.Student;
import org.hibernate.Session;

/**
 * Created by Administrator on 2018/2/7.
 */
public class TestTransaction {
    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSession();
       try {
           session.beginTransaction();
           Student student = new Student();
           student.setStuAge((byte) 22);
           student.setStuName("志恒2");
           student.setStuCourse("化学2");
           student.setStuScore(81);
           session.save(student);
           if(true){
               throw new RuntimeException("算法错误");
           }
           session.getTransaction().commit();
       }catch (Exception e){
            e.printStackTrace();
           session.getTransaction().rollback();
       }

    }
}
