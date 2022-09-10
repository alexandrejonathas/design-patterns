public class MySingleton {
    private static final Object lock = new Object();
    private static MySingleton instance;

    private MySingleton(){}

    public static MySingleton getInstance() {
        if(instance == null) {
            //Resolve o problema de aplicações multithreading
            synchronized (lock) {
                if(instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    //Outras operações da classe

}
