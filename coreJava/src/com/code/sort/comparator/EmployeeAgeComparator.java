package com.code.sort.comparator;

import java.util.Comparator;

/**
 * Created by Amit on 22/11/2015.
 */
public class EmployeeAgeComparator implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator e1, EmployeeComparator e2){
        return e1.getId()-e2.getId();
    }
}
