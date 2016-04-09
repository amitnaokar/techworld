package com.code.sort.nativ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Amit on 21/11/2015.
 */
public class NativeDataCollection {
    ArrayList<String> nameList;
    ArrayList<Integer> ageList;
    Iterator<String> stringIterator;
    Iterator<Integer> integerIterator;

    public NativeDataCollection(){
        nameList = new ArrayList<String>();
        ageList = new ArrayList<Integer>();
    }

    public void addNames(){
        nameList.add("Amit");
        nameList.add("Vinay");
        nameList.add("Nitin");
    }

    public void addAges(){
        ageList.add(27);
        ageList.add(26);
        ageList.add(30);
    }

    public void sortAscendingAndPrintString(){
        Collections.sort(nameList);
        System.out.println("Names in Ascending order are:");
        stringIterator = nameList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }

    public void sortDescendingAndPrintString(){
//        Collections.sort(nameList,Collections.reverseOrder());
        Collections.sort(nameList);
        Collections.reverse(nameList);
        System.out.println("Names in Descending order are:");
        stringIterator = nameList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }

    public void sortAscendingAndPrintInteger(){
        Collections.sort(ageList);
        integerIterator = ageList.iterator();
        System.out.println("Ages in Ascending order are:");
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

    public void sortDescendingAndPrintInteger(){
        Collections.sort(ageList,Collections.reverseOrder());
        integerIterator = ageList.iterator();
        System.out.println("Ages in Descending order are:");
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

    public static void main(String args[]){
        NativeDataCollection collection = new NativeDataCollection();
        collection.addNames();
        collection.sortAscendingAndPrintString();
        collection.sortDescendingAndPrintString();

        collection.addAges();
        collection.sortAscendingAndPrintInteger();
        collection.sortDescendingAndPrintInteger();
    }
}
