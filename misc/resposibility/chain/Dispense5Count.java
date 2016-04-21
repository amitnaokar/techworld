package resposibility.chain;

/**
 * Created by Amit on 21-Apr-16.
 */
public class Dispense5Count implements DispenseCount {
    private DispenseCount count;
    public void setNextCount(DispenseCount nextCount) {
        count = nextCount;
    }

    public void dispense(int amount) {
        if(amount>5 && Solution.currency5Avail>0){
            int quotient = amount/5;
            int remainder = 0;
            if(quotient<=Solution.currency5Avail){
                remainder = amount%5;
                ATM.values.add("5 - "+quotient);
                if(remainder>0){
                    this.count.dispense(remainder);
                }
            }else{
                remainder = amount-(Solution.currency5Avail*5);
                ATM.values.add("5 - "+Solution.currency5Avail);
                this.count.dispense(remainder);
            }
        }else{
            this.count.dispense(amount);
        }
    }
}
