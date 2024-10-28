package com.workintech.developers;

public class HRManager extends Employee {
    private SeniorDeveloper[] seniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private JuniorDeveloper[] juniorDevelopers;

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];

    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary()* 2.7);
    }
    public void addEmployee(JuniorDeveloper jd) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = jd; return;
            }
        }
        System.out.println("No available slot for JuniorDeveloper");
    }
    public void addEmployee(MidDeveloper md) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = md; return;
            }
        }
        System.out.println("No available slot for MidDeveloper");
    }
    public void addEmployee(SeniorDeveloper sd) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = sd; return;
            }
        }
        System.out.println("No available slot for SeniorDeveloper"); }
}
