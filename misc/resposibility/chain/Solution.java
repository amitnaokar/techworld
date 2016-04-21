package resposibility.chain;

import java.util.Scanner;

/**
 * Created by Amit on 22-Apr-16.
 */
public class Solution {
    public static int currency10Avail;
    public static int currency5Avail;
    public static int currency2Avail;
    public static int currency1Avail;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int amount;
        amount = scanner.nextInt();
        currency10Avail = scanner.nextInt();
        currency5Avail = scanner.nextInt();
        currency2Avail = scanner.nextInt();
        currency1Avail = scanner.nextInt();

        ATM atm = new ATM();
        atm.count1.dispense(amount);
        for(int i=0;i<ATM.values.size();i++){
            System.out.printf(ATM.values.get(i));
        }
    }

}
