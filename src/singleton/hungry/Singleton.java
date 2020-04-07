package singleton.hungry;


/**
 * @author sjt
 * @Date  2020-04-07 00:59:04
 */
//饿汉：类初始化就实例化，天生线程安全
public class Singleton {
    private Singleton(){}

    private static final Singleton  singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }


}
