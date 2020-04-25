package flyweight;

import java.util.EnumMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new EnumMap<>(ShapeType.class);

    public static Shape getShape(ShapeType type) {

        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type == ShapeType.OVAL_FILL) {
                shapeImpl = new Oval(true);
            } else if (type == ShapeType.OVAL_NO_FILL) {
                shapeImpl = new Oval(false);
            } else if (type == ShapeType.LINE) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }

        return shapeImpl;
    }

    public enum ShapeType {
        OVAL_FILL,
        OVAL_NO_FILL,
        LINE,
        ;
    }
}
