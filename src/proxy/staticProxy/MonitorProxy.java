package proxy.staticProxy;


public class MonitorProxy implements IUserController {

    private UserController userController;
    private Monitor monitor;

    public MonitorProxy(UserController userController){
        this.userController =userController;
        this.monitor = new Monitor();
    }

    @Override
    public void login(){
        long startTime = System.currentTimeMillis();
        //do 被代理的方法
        userController.login();

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;

        String apiName = userController.getClass().getName() + ":"
                        +Thread.currentThread().getStackTrace()[1].getMethodName();
        monitor.record(apiName,responseTime);

    }

    @Override
    public void exit(){

    }

}
