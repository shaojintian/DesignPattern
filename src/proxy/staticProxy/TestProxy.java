package proxy.staticProxy;

import org.junit.*;
public class TestProxy {

    @Test
    public void testProxy(){
        MonitorProxy monitorProxy = new MonitorProxy(new UserController());
        monitorProxy.login();
    }

}
