package proiect.persistence.entity;

import java.util.List;

public class Report {
    private long id;
    private String username;
    private List<Skill> skills;
    private int salary;

    public Report(long id, String username, List<Skill> skills, int salary) {
        this.id = id;
        this.username = username;
        this.skills = skills;
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int getSalary() {
        return salary;
    }
}
