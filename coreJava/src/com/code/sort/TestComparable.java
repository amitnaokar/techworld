package com.code.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparable {
    public static void main(String[] args) {
        StudentEntity e1 = new StudentEntity("Amit", "Naokar", 28);
        StudentEntity e2 = new StudentEntity("Vinay", "Agrawal", 27);
        StudentEntity e3 = new StudentEntity("Nitin", "Khilwani", 30);
        ArrayList<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        studentEntities.add(e1);
        studentEntities.add(e2);
        studentEntities.add(e3);
        System.out.println("Before Sort");
        Iterator iterator = studentEntities.iterator();
        while (iterator.hasNext()) {
            StudentEntity tmp = (StudentEntity) iterator.next();
            System.out.println(tmp.toString());
        }
        Collections.sort(studentEntities);
        System.out.println("After Sort");
        iterator = studentEntities.iterator();
        while (iterator.hasNext()) {
            StudentEntity tmp = (StudentEntity) iterator.next();
            System.out.println(tmp.toString());
        }
    }
}
