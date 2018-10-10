package lazyInitialization;

public class LazyInitializedSingleton {

    /*
    Lazy initialization method to implement Singleton pattern creates the instance in the global access
    method.
     */

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    /*
    The above implementation works fine in case of single threaded environment but when it comes to
    multithreaded systems, it can cause issues if multiple threads are inside the if loop at the same time.
     */
}
