package strategy;

public class CashReturn extends CashSuper {
    private final int returnUnit = 30;

    @Override
    public double acceptCash() {
        double cash = getCash();
        int times = (int) cash / 300;
        return cash - times * returnUnit;

    }
}
