package com.ruirui.test;


import com.ruirui.bean.Dept;
import com.ruirui.bean.Staff;
import com.ruirui.dao.DeptDao;
import com.ruirui.dao.StaffDao;

/**
 * Created by Administrator on 2018/2/6.
 */
public class TestDeptDao {
    public static void main(String[] args) {
        DeptDao deptDao = new DeptDao();
        Dept dept = deptDao.queryById(1);
        System.out.println(dept.getDeptName());
    }
}
