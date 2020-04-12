package proxy.dynamic;

public class UserController implements  IUserController{

    @Override
    public void proxiedMethod(){

        System.out.println("do something ....");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }

    }
}
