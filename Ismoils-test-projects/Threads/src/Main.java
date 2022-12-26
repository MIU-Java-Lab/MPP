class SingleTon {
    private static SingleTon instance;
    public static int counter = 0;

    private SingleTon() {
        counter += 1;
    }
    public static SingleTon getInstance() {
        if(instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
    synchronized public static SingleTon syncGetInstance() {
        if(instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}

public class Main {

    public static void NOTThreadSafeCode() {
        Runnable r  = () -> {
          for(int i=0; i<100; i++) {
              SingleTon.getInstance();
          }
        };
        for(int i=0; i<100; i++) {
            new Thread(r).start();
        }
        // should be 1, but it is more than 1 because we are running multiple threads at once
        // code is not thread safe
        // this is called "Race Condition" (multiple threads working on same object)
        System.out.println("Singleton counter: " + SingleTon.counter);
    }

    public static void threadSafeCode() {
        // we can use synchronized method to make it thread safe
        Runnable r  = () -> {
            for(int i=0; i<100; i++) {
                SingleTon.syncGetInstance();
            }
        };
        for(int i=0; i<100; i++) {
            new Thread(r).start();
        }
        System.out.println("Singleton counter SYNC: " + SingleTon.counter);
    }

    public static void verySimpleExample() {
        // We need to a Runnable interface to use threads
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };
        Runnable r2 = () -> System.out.println("Thread 2");

        new Thread(r1).start();
        new Thread(r2).start();
    }


    public static void main(String[] args) {
        verySimpleExample();
        // NOTThreadSafeCode();
        threadSafeCode();

        // From Java 8 we can use Executor class to run threads instead of Thread class
        // it has optimization techniques by default

        // Parallel streams - go for parallel only if your list is too large
        // otherwise sequential stream is good
        // Also don't use findFirst, limit with parallel streams
    }
}