package com.code.equality;

public class StudentEntity {
    String name;
    String surname;
    int age;

    public StudentEntity(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        StudentEntity s = (StudentEntity) o;
        if (s.name.equals(this.name))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\t surname: " + this.surname + "\tage: " + this.age + "\thashcode:" + this.name.hashCode();
    }
}

