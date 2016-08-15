package com.code.collection.hierarchy.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Amit on 13-May-16.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Nitin");
        names.add("Vinay");
        names.add("Hrushikesh");
        names.add("Dipam");
        names.add("Diptaneel");
        names.add("Somnath");
        names.add("Pratikshit");

        ListIterator<String> listIterator = names.listIterator();

        System.out.println("contents of list in normal order using listIterator are:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\ncontents of list in reverse order using listIterator are:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\ncontents of list in normal order using forEach loop are:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\ncontents of list in normal order using for loop are:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
