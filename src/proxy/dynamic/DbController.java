package proxy.dynamic;

public class DbController implements IDbController{

    @Override
    public void write(){
        System.out.println("do db logic");
    }
}
