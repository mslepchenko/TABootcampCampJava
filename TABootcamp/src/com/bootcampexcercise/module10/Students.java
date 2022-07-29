package com.bootcampexcercise.module10;

public class Students extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Students() {
        super();
        this.schoolName = "Default School";
    }

    public Students(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        String introduceStr = String.format("I am study in university %s", schoolName);
        System.out.println(introduceStr);
    }
}
