package com.code.sort.comparator;

import java.util.Comparator;

/**
 * Created by Amit on 22/11/2015.
 */
public class EmployeeNameComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator e1, EmployeeComparator e2) {
        String name1 = e1.getName();
        String name2 = e2.getName();
        return name1.compareTo(name2);
    }
}
