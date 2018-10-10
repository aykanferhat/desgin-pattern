package eagerInitialization;

public class EagerInitializedSingleton {

    /*

    In eager initialization, the instance of Singleton Class is created at the time of class loading,
    this is the easiest method to create a singleton class.

     */

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
