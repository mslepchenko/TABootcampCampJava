package com.bootcampexcercise.module5.activity;

public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person_I myPerson = new Person_I("Sarah Johnson", 21 );


        System.out.println("-----------------------------");
        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun
        Employee_I myEmployee = new Employee_I();
        myEmployee.setSalary( 70000.00);
        myEmployee.setTitle("Developer");
        myEmployee.setName("Shawn Cun");
        myEmployee.setAge(32);

        // Print Info using Employee object
        System.out.println("Employee Info:");
        System.out.println(myEmployee.getSalary());
        System.out.println(myEmployee.getTitle());
        System.out.println(myEmployee.getName());
        System.out.println(myEmployee.getAge());

                // Print Info using Person object
        System.out.println("\nPerson Info:");
        System.out.println(myPerson.getAge());
        System.out.println(myPerson.getName());

    }

}
