package com.code.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Amit on 22/11/2015.
 */
public class TestEmployeeComparable {
    public static void main(String args[]) {
        EmployeeComparable e1 = new EmployeeComparable("Amit", 1);
        EmployeeComparable e2 = new EmployeeComparable("Vinay", 3);
        EmployeeComparable e3 = new EmployeeComparable("Nitin", 2);
        EmployeeComparable e4 = new EmployeeComparable("Diptaneel", 4);
        EmployeeComparable e5 = new EmployeeComparable("Dipam", 5);
        EmployeeComparable e6 = new EmployeeComparable("Anjana", 6);
        EmployeeComparable e7 = new EmployeeComparable("Lynette", 7);
        List<EmployeeComparable> employeeComparableList = new ArrayList<EmployeeComparable>();
        employeeComparableList.add(e1);
        employeeComparableList.add(e2);
        employeeComparableList.add(e3);
        employeeComparableList.add(e4);
        employeeComparableList.add(e5);
        employeeComparableList.add(e6);
        employeeComparableList.add(e7);

        System.out.println("Employees before sort");
        Iterator<EmployeeComparable> iterator = employeeComparableList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        System.out.println("\nEmployees after sort");
        Collections.sort(employeeComparableList);
        iterator = employeeComparableList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
