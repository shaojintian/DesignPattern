package proxy.dynamic;

public class Monitor {

    public void record(String apiName, long responseTime){
        //..... write in db
        System.out.println("api:"+apiName+" ---- Use time:"+responseTime+"ms");
    }
}
