package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts to working");
        setSalary(getSalary() * 2);
    }
};
