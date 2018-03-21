package com.ruirui.bean;

import com.ruirui.bean.Dept;

/**
 * Created by Administrator on 2018/2/5.
 */
public class Staff {
    private Integer staffId;
    private String staffName;
    private Integer staffWeage;
    private Integer staffVersion;
    private Dept dept;
    private Byte staffAge;

    public Integer getStaffVersion() {
        return staffVersion;
    }

    public void setStaffVersion(Integer staffVersion) {
        this.staffVersion = staffVersion;
    }

    public Byte getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Byte staffAge) {
        this.staffAge = staffAge;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getStaffWeage() {
        return staffWeage;
    }

    public void setStaffWeage(Integer staffWeage) {
        this.staffWeage = staffWeage;
    }

    @Override
    public String toString() {
        return "Staff{" +
                    "staffName='" + staffName + '\'' +
                    ", staffWeage=" + staffWeage +
                    ", staffAge=" + staffAge +
                    '}';
    }
}
