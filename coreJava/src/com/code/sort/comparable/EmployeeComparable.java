package com.code.sort.comparable;

import java.util.Comparator;

/**
 * Created by Amit on 21/11/2015.
 */
public class EmployeeComparable implements Comparable<EmployeeComparable> {

    String name;
    int id;

    public EmployeeComparable(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(EmployeeComparable e) {
        String name1 = this.getName();
        String name2 = e.getName();
        return name1.compareTo(name2);
    }

    public String toString(){
        return "name:"+name+"\tid:"+id;
    }
}
