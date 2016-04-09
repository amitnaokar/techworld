package com.code.sort.comparator;

/**
 * Created by Amit on 21/11/2015.
 */
public class EmployeeComparator {

    String name;
    int id;

    public EmployeeComparator(String name, int id){
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

    public String toString(){
        return "name:"+name+"\tid:"+id;
    }
}
