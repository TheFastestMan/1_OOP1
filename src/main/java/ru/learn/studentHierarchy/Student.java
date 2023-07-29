package ru.learn.studentHierarchy;

public class Student extends User {
   private Integer grant;

    @Override
    protected int getIncome() {
        Student student = new Student();
        return grant != null ? grant : 0;
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }
}
