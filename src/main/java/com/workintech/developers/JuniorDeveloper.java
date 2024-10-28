package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void work() {
        System.out.println("Junior Developer starts to working");
        setSalary(getSalary() * 0.7);
    }
}
