package ru.learn.employees;

public class Main {
    public static void main(String[] args) {
        WorkerSalary worker = new Worker();
        WorkerSalary management = new Management();
        WorkerSalary engineer = new Engineer();

        worker.salaryCalculate(120.5f,200.5f, 0f);
        management.salaryCalculate(500000.0f,0f,10f);
        engineer.salaryCalculate(210.0f,40.2f,5f);


    }
}
