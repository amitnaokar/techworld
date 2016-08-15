package com.code.equality;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Amit on 24/11/2015.
 */
public class HashMapLoopDemo {

    public static void main(String args[]) {
        HashMap<String, StudentEntity> studentEntityHashMap = new HashMap<>();

        StudentEntity s1 = new StudentEntity("amit", "naokar", 27);
        StudentEntity s2 = new StudentEntity("nitin", "khilwani", 30);
        StudentEntity s3 = new StudentEntity("vinay", "agrawal", 26);

        studentEntityHashMap.put("amit", s1);
        studentEntityHashMap.put("nitin", s2);
        studentEntityHashMap.put("vinay", s3);
        studentEntityHashMap.put("vinay", s1);
        studentEntityHashMap.put(null, s2);
        studentEntityHashMap.put(null, s3);
        studentEntityHashMap.put("null1", null);
        studentEntityHashMap.put("null2", null);


        System.out.println("\nusing iterator over map.entrySet()");
        Iterator iterator = studentEntityHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, StudentEntity> tmp = (Map.Entry<String, StudentEntity>) iterator.next();
            if (tmp.getValue() != null)
                System.out.println("key:" + tmp.getKey() + "\t\tvalue:\t" + tmp.getValue().toString());
            else
                System.out.println("key:" + tmp.getKey() + "\t\tvalue:\t" + tmp.getValue());
        }

        System.out.println("\nusing advance for loop for map.entrySet()");
        for (Map.Entry<String, StudentEntity> entry : studentEntityHashMap.entrySet()) {
            if (entry.getValue() != null)
                System.out.println("key:" + entry.getKey() + "\t\tvalue:\t" + entry.getValue().toString());
            else
                System.out.println("key:" + entry.getKey() + "\t\tvalue:\t" + entry.getValue());
        }

        StudentEntity status = studentEntityHashMap.get("amit");
        System.out.println("status:" + status);

    }
}
