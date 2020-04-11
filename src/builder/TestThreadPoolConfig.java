package builder;

public class TestThreadPoolConfig {
    public static void main(String[] args) {
        ThreadPoolConfig pc  = new ThreadPoolConfig.Builder()
                .setName("pool1")
                .setTotal(100)
                .setMinSpare(2)
                .setMaxSpare(10)
                .build();

    }


}
