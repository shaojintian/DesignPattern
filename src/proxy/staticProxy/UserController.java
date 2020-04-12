package proxy.staticProxy;

public class UserController implements IUserController{

    @Override
    public void login(){
        System.out.println("do login logic");
    }

    @Override
    public void exit(){

    }
}
