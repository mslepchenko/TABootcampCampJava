package com.bootcampexcercise.module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Margarita", 24, "SAP Developer", "Accenture", 100);
        Employee emp2 = new Employee("Elizaveta", 26, "C# Developer", "Accenture", 200);
        Employee emp3 = new Employee("Alexander", 20, "Java Developer", "Accenture", 200);
        Employee emp4 = new Employee("Viktor", 30, "Python Developer", "Accenture", 400);
        Employee emp5 = new Employee("Peter", 41, "Senior Java Developer", "Accenture", 600);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        String highestPaidEmpName = Employee.getHighestPaidEmp(empList);

        if (highestPaidEmpName != null) {
            System.out.println("The Employee whose salary is the highest is: " + highestPaidEmpName);
        }
    }
}
