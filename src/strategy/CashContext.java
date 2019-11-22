package strategy;



public class CashContext {

    private CashSuper cashSuper;
    public CashContext(String activity) {

        switch (activity){

            case "正常":
                cashSuper = new CashNormal();
                break;
            case "满300减30":
                cashSuper = new CashReturn();
                break;
            case "打8折":
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
