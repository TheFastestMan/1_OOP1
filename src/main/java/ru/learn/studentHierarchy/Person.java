package ru.learn.studentHierarchy;

public class Person extends Student{

    private Integer salary;

    @Override
    protected int getIncome() {
       return super.getIncome() + (salary == 4 ? salary : 0);
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
