package com.code.sort.comparator;

import com.code.sort.comparator.EmployeeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Amit on 22/11/2015.
 */
public class TestEmployeeComparator {
    public static void main(String args[]){
        EmployeeComparator e1 = new EmployeeComparator("Amit",1);
        EmployeeComparator e2 = new EmployeeComparator("Vinay",3);
        EmployeeComparator e3 = new EmployeeComparator("Nitin",2);
        EmployeeComparator e4 = new EmployeeComparator("Diptaneel",4);
        EmployeeComparator e5 = new EmployeeComparator("Dipam",5);
        EmployeeComparator e6 = new EmployeeComparator("Anjana",6);
        EmployeeComparator e7 = new EmployeeComparator("Lynette",7);
        List<EmployeeComparator> EmployeeComparatorList = new ArrayList<EmployeeComparator>();
        EmployeeComparatorList.add(e1);
        EmployeeComparatorList.add(e2);
        EmployeeComparatorList.add(e3);
        EmployeeComparatorList.add(e4);
        EmployeeComparatorList.add(e5);
        EmployeeComparatorList.add(e6);
        EmployeeComparatorList.add(e7);

        System.out.println("Employees before sort");
        Iterator<EmployeeComparator> iterator = EmployeeComparatorList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("\nEmployees after id sort");
        Collections.sort(EmployeeComparatorList,new EmployeeAgeComparator());
        iterator = EmployeeComparatorList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("\nEmployees after name sort");
        Collections.sort(EmployeeComparatorList,new EmployeeNameComparator());
        iterator = EmployeeComparatorList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
