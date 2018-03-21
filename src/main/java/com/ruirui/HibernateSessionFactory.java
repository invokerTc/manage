package com.ruirui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2018/2/6.
 */
public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;
//    private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
    private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    static {
        Configuration configure = new Configuration().configure();
        sessionFactory = configure.buildSessionFactory();
    }
    public static Session getSession(){
        Session session = threadLocal.get();
        if(session==null){
            session=sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
}
