package com.bootcampexcercise.module10;

public class AbstractActivity {

    public static void main(String[] args) {
        System.out.println("Default employee:");
        Employee defaultEmployee = new Employee();
        defaultEmployee.introduce();

        System.out.println("\nDefault student:");
        Students defaultStudents = new Students();
        defaultStudents.introduce();

        System.out.println("\nCustom employee:");
        Employee customEmployee = new Employee("Margarita", 24, "SAP Developer", "Accenture", 1000000);
        customEmployee.introduce();

        System.out.println("\nCustom student:");
        Students customStudents = new Students("Margarita", 24, "Latvian University");
        customStudents.introduce();

        Calculator calc = new Calculator();
        System.out.println(calc.add(2000000000, 2000000000));
    }
}
