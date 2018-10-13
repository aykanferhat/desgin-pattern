package example1;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    /*

    The flyweight factory will be used by client programs to instantiate the Object, so we need to keep a map of Objects
    in the factory that not should be accessible by client application.


    Whenever client program makes a call to get instance of Object, it should be returned from the HashMap, if not found
    then create new Object then put in the Map and then return it. We need to make sure that all the intrinsic properties
    are considered while creating the Object.
     */

    private static final Map<ShapeType,Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        System.out.println("Searching type : " + type.name());
        Shape shape = shapes.get(type);
        if (type.equals(ShapeType.OVAL_FILL)) {
            shape = new Oval(true);
        } else if (type.equals(ShapeType.OVAL_NOFILL)) {
            shape = new Oval(false);
        } else if (type.equals(ShapeType.LINE)) {
            shape = new Line();
        }
        shapes.put(type, shape);
        System.out.println("Shapes Map size : " + shapes.size());
        return shape;
    }

    public enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
