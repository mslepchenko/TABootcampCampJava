package com.bootcampexcercise.module10;

import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private int salary;

    public Employee() {
        super();
        this.jobTitle = "Default Job Title";
        this.company = "Dedault Company";
        this.salary = -42;
    }

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public void introduce() {
        String introduceStr = String.format("My name is %s and i am %d years old\n" +
                "I am work as %s in %s and my salary is %d", getName(), getAge(), jobTitle, company, salary);
        System.out.println(introduceStr);
    }

    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList.isEmpty()) {
            System.out.println("Employee list is empty");
            return null;
        }

        Employee highestPaidEmp = empList.get(0);

        for (Employee emp : empList){
            if (emp.salary > highestPaidEmp.salary) {
                highestPaidEmp = emp;
            }
        }

        return highestPaidEmp.getName();
    }
}
