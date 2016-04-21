package resposibility.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Amit on 21-Apr-16.
 */
public class ATM {
    public DispenseCount count1;
    public static List<String> values = new ArrayList<String>();

    public ATM(){
        this.count1 = new Dispense10Count();
        DispenseCount count2 = new Dispense5Count();
        DispenseCount count3 = new Dispense2Count();
        DispenseCount count4 = new Dispense1Count();
        count1.setNextCount(count2);
        count2.setNextCount(count3);
        count3.setNextCount(count4);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("amount to be dispensed:");
        int amountToBeDispensed = scanner.nextInt();

        System.out.print("Rs 10 notes:");
        int rs10Notes = scanner.nextInt();

        System.out.print("Rs 5 notes:");
        int rs5Notes = scanner.nextInt();

        System.out.print("Rs 2 notes:");
        int rs2Notes = scanner.nextInt();

        System.out.print("Rs 1 notes:");
        int rs1Notes = scanner.nextInt();
    }
}
