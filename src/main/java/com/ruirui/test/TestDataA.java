package com.ruirui.test;

import com.ruirui.HibernateSessionFactory;
import com.ruirui.bean.Staff;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Session;

/**
 * Created by Administrator on 2018/2/6.
 */
public class TestDataA {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                new TestDataA().updateAge();
            }
        }).start();
    }
    public void updateAge(){
        Session session = HibernateSessionFactory.getSession();
        session.beginTransaction();
        Staff staff = session.get(Staff.class, 1);
        int age=staff.getStaffAge()-1;
        staff.setStaffAge((byte)age);
        session.update(staff);
        session.getTransaction().commit();
    }
}
