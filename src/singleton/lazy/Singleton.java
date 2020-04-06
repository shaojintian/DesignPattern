package singleton.lazy;

//懒汉非线程安全-第一次调用时实例化
public class Singleton {

    private Singleton(){}

    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
