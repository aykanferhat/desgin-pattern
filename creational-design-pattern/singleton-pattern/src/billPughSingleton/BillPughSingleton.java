package billPughSingleton;

public class BillPughSingleton {

    /*
    Prior to java 6, java memory model had a lot of issues and another singleton approaches used to fail
    in certain scenarios where to many thread try to get the instance of the Singleton class simultaneously.
    So Bill Pugh came up with a different approach to create the Singleton class using a inner static
    helper class.
     */

    private BillPughSingleton() {}

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /*
    Not the private inner static class that contains the instance of the singleton class.
    When the singleton class is loaded.

    ** SingletonHelper class is not loaded into memory and only when someone calls the get
    instance method, this class gets loaded and creates the Singleton class instance.
     */
}
