package enumSingleton;

public enum EnumSingleton {

    /*
    it does not allow lazy initialization.
     */

    INSTANCE;

    public static void doSomething() {
        // do something
    }
}
