package com.code.prime;

import java.util.*;

public class PrimeNumber {

    public static List<Integer> getPrimeNumbersInRange(int start, int end){
        List<Integer> primeNumbers = new ArrayList<Integer>();
        if(start==0){
            primeNumbers.add(start);
            start++;
        }
        for(int current=start; current<=end; current++){
            int dividers = 0;
            for(int j=2;j<start;j--){
                if(current%j==0){
                    dividers++;
                }
            }
            if(dividers==2){
                primeNumbers.add(current);
            }
        }
        return primeNumbers;
    }

    public static Boolean isPrimeNumber(int number){
        Boolean result = false;
        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("start :");
        int start = input.nextInt();
        System.out.print("end :");
        int end = input.nextInt();
        List<Integer> primeNumbers = getPrimeNumbersInRange(start,end);
        Iterator<Integer> iterator = primeNumbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
