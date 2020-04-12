package proxy.dynamic;

import org.junit.Test;

public class TestDynamicProxy {
    @Test
    public void test(){
        MonitorProxy monitorProxy = new MonitorProxy();

        IUserController userController = (IUserController) monitorProxy.createProxy(new UserController());
        userController.proxiedMethod();

        IDbController dbController = (IDbController)monitorProxy.createProxy(new DbController());
        dbController.write();

    }
}
