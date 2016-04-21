package resposibility.chain;

/**
 * Created by Amit on 21-Apr-16.
 */
public class Dispense1Count implements DispenseCount {
    private DispenseCount count;
    public void setNextCount(DispenseCount nextCount) {
        count = nextCount;
    }

    public void dispense(int amount) {
        if(amount>1 && Solution.currency1Avail>0){
            int quotient = amount/1;
            int remainder = 0;
            if(quotient<=Solution.currency1Avail){
                remainder = amount%1;
                ATM.values.add("1 - "+quotient);
                if(remainder>0){
                    ATM.values.clear();
                    ATM.values.add("Cash Not Available");
                }
            }else{
                ATM.values.clear();
                ATM.values.add("Cash Not Available");
            }
        }else{
            ATM.values.clear();
            ATM.values.add("Cash Not Available");
        }
    }
}
