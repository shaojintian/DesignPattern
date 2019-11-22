package strategy;

public class CashRebate extends CashSuper {

    public double acceptCash(){
        return getCash() * 0.8;
    }
}
