package com.techworld.hibernate.model;

/**
 * Created by Amit on 20-Apr-16.
 */
public class Employee {
    String fName;
    String lName;
    int salary;
    int id;

    Employee(){ }

    public Employee(String fName, String lName, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
