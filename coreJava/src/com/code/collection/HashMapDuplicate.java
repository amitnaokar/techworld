package com.code.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Amit on 22/11/2015.
 */
public class HashMapDuplicate {
    public static void main(String args[]){
        HashMap<Integer,String> nameMap = new HashMap<>();
        nameMap.put(1,"Amit");
        nameMap.put(2,"Nitin");
        nameMap.put(3,"Vinay");
        nameMap.put(4,"Omkar");
        /*below these are duplicates*/
        nameMap.put(5,"Nitin");
        nameMap.put(6,"Vinay");

        HashSet<String> hashSet = new HashSet<>(nameMap.values());
        Iterator<String> setIterator = hashSet.iterator();
        HashMap<Integer,String> uniqueMap = new HashMap<>();
        HashMap<Integer,String> duplicates = new HashMap<>();
        while(setIterator.hasNext()){
            String name = setIterator.next();
            for(Map.Entry<Integer,String> entry:nameMap.entrySet()){
                if(name.equals(entry.getValue()) && !uniqueMap.containsValue(name)){
                    uniqueMap.put(entry.getKey(),entry.getValue());
                }else if(name.equals(entry.getValue())&&!duplicates.containsValue(name)){
                    duplicates.put(entry.getKey(),entry.getValue());
                }
            }
        }

        System.out.println("\nUnique values from map");
        for(Map.Entry<Integer,String> entry:uniqueMap.entrySet()){
            System.out.println("key:"+entry.getKey()+"\tvalue:"+entry.getValue());
        }

        System.out.println("\nDuplicate values from map");
        for(Map.Entry<Integer,String> e:duplicates.entrySet()){
            System.out.println("kay:"+e.getKey()+"\tvalue:"+e.getValue());
        }
    }
}
