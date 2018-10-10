package test;

import eagerInitialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    /*
    Reflection can be used to destroy all the singleton implementation approaches.
     */

    public static void main(String[] args) {

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();

        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            // Below code will destroy the singleton pattern.

            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
