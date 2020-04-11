package strategy;



public class CashContext {

    private CashSuper cashSuper;
    public CashContext(String activity) {

        switch (1){

            case 1:
                cashSuper = new CashNormal();
                break;
            case 2:
                cashSuper = new CashReturn();
                break;
            case 3:
                cashSuper = new CashRebate();
            default:
                throw new RuntimeException("illegal cash activity");

        }
    }

    public double getResult(double cash){
        cashSuper.setCash(cash);
        return cashSuper.acceptCash();
    }
}
