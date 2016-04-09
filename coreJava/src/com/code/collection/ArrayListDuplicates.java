package com.code.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Amit on 22/11/2015.
 */
public class ArrayListDuplicates {

    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Amit");
        list1.add("Nitin");
        list1.add("Omkar");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Amit");
        list2.add("Nitin");
        list2.add("Dipam");
        list2.add("Vinay");

        ArrayList<String> union = new ArrayList<>(list1);
        union.addAll(list2);

        ArrayList<String> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        System.out.println("\nlist1 containing only common elements :");
        Iterator<String> iterator = intersection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nlist without common elements");
        union.removeAll(intersection);
        iterator = union.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
