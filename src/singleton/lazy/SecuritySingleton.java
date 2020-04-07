package singleton.lazy;

import java.io.Serializable;

public class SecuritySingleton {

    private SecuritySingleton(){}

    private  static SecuritySingleton singleton = null;

    /**
     * 1.
     * 同步
     */
    /**
     * public synchronized static SecuritySingleton getInstance(){

        if(singleton == null){
            singleton = new SecuritySingleton();
        }

        return singleton;
    }
     */

    /**
     * 2.double check
     * @return

    private volatile static SecuritySingleton singleton =  null;

    public static  SecuritySingleton getInstance(){
        if (singleton==null){
            synchronized (SecuritySingleton.class){
                if(singleton==null){
                    singleton = new SecuritySingleton();
                }
            }
        }

        return singleton;
    }
    */

    /**
     * 3.静态内部类 最好，不用同步损耗性能，实现线程安全
     */
    private static class LazyHolder{
        private static final SecuritySingleton  INSTANCE = new SecuritySingleton();
    }

    public static final SecuritySingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

}
