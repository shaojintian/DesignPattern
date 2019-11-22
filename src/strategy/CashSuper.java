package strategy;

public abstract class CashSuper {
    private double cash;

    public double getCash() {
        return cash;
    }
    public void setCash(double cash){
        this.cash =cash;
    }

    public abstract double acceptCash();

}
