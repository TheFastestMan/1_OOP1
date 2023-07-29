package ru.learn.studentHierarchy;

public class Main {
    public static void main(String[] args) {


        Person p = new Person();
        Student s = new Student();
        s.setGrant(3);
        p.setSalary(4);

        System.out.println("Salary from person "+p.getIncome());
        System.out.println("Grant from student "+s.getIncome());

    }
}
