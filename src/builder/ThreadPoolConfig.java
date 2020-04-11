package builder;

/**
 * @author sjt
 * @date 2020-04-07 15:56:13
 */
public class ThreadPoolConfig {
    private String name;
    private int total;
    private int minSpare;
    private int maxSpare;

    //constructor
    private ThreadPoolConfig(Builder builder){
        this.name = builder.name;
        this.total =builder.total;
        this.minSpare =builder.minSpare;
        this.maxSpare = builder.maxSpare;

    }
    //static inner class
    public static class Builder{
        private static final int DEFAULT_TOTAL = 10;

        private  String name;
        private int total = DEFAULT_TOTAL;
        private int minSpare;
        private int maxSpare;

        public Builder(){}

        public Builder setName(String name) {
            if(name==null || name.trim().length()==0){
                throw new IllegalArgumentException("no name ");
            }
            this.name = name;
            return this;
        }

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setMinSpare(int minSpare) {
            this.minSpare = minSpare;
            return this;
        }

        public Builder setMaxSpare(int maxSpare){
            this.maxSpare = maxSpare;
            return this;
        }

        //check illegal args and return pool
        public ThreadPoolConfig build(){
            if(minSpare > maxSpare || minSpare >total || maxSpare >total){
                throw new  IllegalArgumentException("illegal config args");
            }
            return new ThreadPoolConfig(this);
        }

    }
}
