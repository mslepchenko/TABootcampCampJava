package com.bootcampexcercise.practice;

public class PolymorphismSample {


    public static void main(String arg[]) {

        Person_P pers = new Person_P();
        Student_P stud = new Student_P();
        //Person_P ps = new Student_P();
//		This line will give error
//		Student_P pss= new Person_P();


        stud.setGrade(10);
        stud.setSchool("A Fictional School");
        stud.setName("Sandra Chu");
        stud.setAge(15);

        // Method Overloading
        System.out.println("-------------Method Overloading----------------");
        pers.address("Riga", "Rigas");
        // you will get error if you try to use child method from parent object
		//pers.address("SanJose", "CA", 1234, "Pines St"); // calls address() method from the Student_P class
        stud.address("SanJose", "CA");  // calls address() method from the Person_P class
        stud.address("SanJose", "CA", 1234, "Pines St"); // calls address() method from the Student_P class

        // Method Overriding
        System.out.println("-------------Method Overriding----------------");
        pers.announce();
        System.out.println("-----------------------------");
        stud.announce();
        System.out.println("-----------------------------");
        //ps.announce();


    }
}