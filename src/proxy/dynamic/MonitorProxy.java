package proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MonitorProxy {
    private Monitor monitor;

    public MonitorProxy(){
        this.monitor = new Monitor();
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(),
                                      interfaces,
                                      handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject){
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
            //统计被代理的api的运行时间，各种时间，name等信息
            long startTime = System.currentTimeMillis();
            //do 被代理的方法
            Object result = method.invoke(this.proxiedObject, args);

            long endTime = System.currentTimeMillis();
            long responseTime = endTime - startTime;

            String apiName = proxiedObject.getClass().getName() + ":" +method.getName();
            monitor.record(apiName,responseTime);
            return  result;
        }


    }


    public static void main(String[] args) {
        // do proxy
        MonitorProxy monitorProxy = new MonitorProxy();
        IUserController userController = (IUserController) monitorProxy.createProxy(new UserController());
        userController.proxiedMethod();

        //no proxy
        //UserController userController1 = new UserController();
        //.proxiedMethod();
    }


}
