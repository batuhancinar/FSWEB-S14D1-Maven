package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Mid Developer starts to working");
        setSalary(getSalary() * 1.4);
    }
};
