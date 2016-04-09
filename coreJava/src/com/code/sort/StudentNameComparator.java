package com.code.sort;
import java.util.Comparator;
public class StudentNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        StudentEntity e1 = (StudentEntity)o1;
        StudentEntity e2 = (StudentEntity)o2;
        return  e1.name.compareTo(e2.name);
    }
}
