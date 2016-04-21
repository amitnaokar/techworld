package resposibility.chain;

/**
 * Created by Amit on 21-Apr-16.
 */
public interface DispenseCount {
    void setNextCount(DispenseCount nextCount);
    void dispense(int amount);
}
