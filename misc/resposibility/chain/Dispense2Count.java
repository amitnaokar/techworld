package resposibility.chain;

/**
 * Created by Amit on 21-Apr-16.
 */
public class Dispense2Count implements DispenseCount {
    private DispenseCount count;
    public void setNextCount(DispenseCount nextCount) {
        count = nextCount;
    }

    public void dispense(int amount) {
        if(amount>2 && Solution.currency2Avail>0){
            int quotient = amount/2;
            int remainder = 0;
            if(quotient<=Solution.currency2Avail){
                remainder = amount%2;
                ATM.values.add("2 - "+quotient);
                if(remainder>0){
                    this.count.dispense(remainder);
                }
            }else{
                remainder = amount-(Solution.currency2Avail*2);
                ATM.values.add("2 - "+Solution.currency2Avail);
                this.count.dispense(remainder);
            }
        }else{
            this.count.dispense(amount);
        }
    }
}
