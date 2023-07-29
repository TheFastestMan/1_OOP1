package ru.learn.employees;

public class Worker extends Engineer {

    @Override
    public void salaryCalculate(float salary, float hours, float percentage) {
        System.out.println("Salary in hour: " + salary * hours + " Rub");
    }
}
