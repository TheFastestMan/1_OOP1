package ru.learn.employees;

public class Management extends WorkerSalary {
    @Override
    public void salaryCalculate(float salary, float hours, float percentage) {
        float salaryInPercent = (salary/100) * percentage;
        System.out.println("Salary in percentage: " + salaryInPercent + " Rub");
    }
}
