package com.ruirui.dao;



import com.ruirui.HibernateSessionFactory;
import com.ruirui.bean.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/2/6.
 */
public class StaffDao {

    public  Staff queryById(int staffId){
        Session session = HibernateSessionFactory.getSession();
        Staff staff = session.get(Staff.class, staffId);
         return  staff;
    }

    public List<Staff> queryByName(String name){
        Session session = HibernateSessionFactory.getSession();
        Query query = session.createQuery("from Staff where staffName=:name");
        query.setParameter("name",name);
        List list = query.list();
        return  list;
    }

    public static void main(String[] args) {
        Staff staff = new StaffDao().queryById(3);
        System.out.println(staff.getStaffName());
    }
}
