package com.ruirui.bean;

/**
 * Created by Administrator on 2018/2/7.
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private Byte stuAge;
    private String stuCourse;
    private Integer stuScore;
    private Integer stuVersion;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Byte getStuAge() {
        return stuAge;
    }

    public void setStuAge(Byte stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }

    public Integer getStuScore() {
        return stuScore;
    }

    public void setStuScore(Integer stuScore) {
        this.stuScore = stuScore;
    }

    public Integer getStuVersion() {
        return stuVersion;
    }

    public void setStuVersion(Integer stuVersion) {
        this.stuVersion = stuVersion;
    }

    @Override
    public String toString() {
        return "Student{" +
                    "stuName='" + stuName + '\'' +
                    ", stuAge=" + stuAge +
                    ", stuCourse='" + stuCourse + '\'' +
                    ", stuScore=" + stuScore +
                    '}';
    }
}
