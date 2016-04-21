package resposibility.chain;

/**
 * Created by Amit on 21-Apr-16.
 */
public class Dispense10Count implements DispenseCount {
    private DispenseCount count;
    public void setNextCount(DispenseCount nextCount) {
        count = nextCount;
    }

    public void dispense(int amount) {
        if(amount>10 && Solution.currency10Avail>0){
            int quotient = amount/10;
            int remainder = 0;
            if(quotient<=Solution.currency10Avail){
                remainder = amount%10;
                ATM.values.add("10 - "+quotient);
                if(remainder>0){
                    this.count.dispense(remainder);
                }
            }else{
                remainder = amount-(Solution.currency10Avail*10);
                ATM.values.add("10 - "+Solution.currency10Avail);
                this.count.dispense(remainder);
            }
        }else{
            this.count.dispense(amount);
        }
    }
}
