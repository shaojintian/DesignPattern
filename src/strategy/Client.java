package strategy;

public class Client {
    public static void main(String[] args) {
        String str  = "满300减30";
        CashContext ctx = new CashContext(str);
        System.out.println(ctx.getResult(600));
    }
}
