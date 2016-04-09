package com.code.sort;
public class StudentEntity implements Comparable {
    String name;
    String surname;
    int age;
    public StudentEntity(String name,String surname,int age){
        this.name=name;this.surname=surname;this.age=age;
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
    public int compareTo(Object o) {
        StudentEntity s = (StudentEntity)o;
        if(this.age>s.age)
            return 1;
        else if (this.age<s.age)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString(){
        return "name: "+this.name+"\t surname: "+this.surname+"\tage: "+this.age;
    }
}

