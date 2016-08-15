package com.code.sort;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        StudentEntity e1 = (StudentEntity) o1;
        StudentEntity e2 = (StudentEntity) o2;
        if (e1.age > e2.age)
            return 1;
        else if (e1.age < e2.age)
            return -1;
        else
            return 0;
    }
}
