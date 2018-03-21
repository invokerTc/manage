package com.ruirui.dao;

import com.ruirui.HibernateSessionFactory;
import com.ruirui.bean.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Administrator on 2018/2/6.
 */
public class DeptDao {
    public Dept queryById(int id){
        Session session = HibernateSessionFactory.getSession();
        Dept dept = session.get(Dept.class, id);
        return dept;
    }
}
