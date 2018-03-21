package com.ruirui.test;

import com.ruirui.bean.Staff;
import com.ruirui.dao.StaffDao;

import java.util.List;

/**
 * Created by Administrator on 2018/2/6.
 */
public class TestStaffDao {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                StaffDao staffDao = new StaffDao();
                Staff staff = staffDao.queryById(1);
                staff.setStaffName("李本");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1-1查询结果\t"+staff.getStaffName());
                Staff staff1 = staffDao.queryById(1);
                System.out.println("1-2查询结果\t"+staff1.getStaffName());
                new Thread(new Runnable() {
                    public void run() {
                        StaffDao staffDao = new StaffDao();
                        Staff staff = staffDao.queryById(1);
                        System.out.println("2-1查询结果\t"+staff.getStaffName());
                    }
                }).start();
            }
        }).start();
    }
}
