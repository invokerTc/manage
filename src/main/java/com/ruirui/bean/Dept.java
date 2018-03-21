package com.ruirui.bean;

import java.util.Set;

/**
 * Created by Administrator on 2018/2/5.
 */
public class Dept {
    private Integer deptId;
    private String deptName;
    private Set<Staff> staffSet;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Staff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<Staff> staffSet) {
        this.staffSet = staffSet;
    }
}
