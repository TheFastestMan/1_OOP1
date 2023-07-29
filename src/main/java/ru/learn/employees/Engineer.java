package ru.learn.employees;

public class Engineer extends Management {

    @Override
    public void salaryCalculate(float salary, float hours, float percentage) {
        float salaryForHours = salary * hours;
        float totalSalary = (salaryForHours/100) * percentage;
        System.out.println("Mixed salary: " + totalSalary + " Rub");

    }
}
