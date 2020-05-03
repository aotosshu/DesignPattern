package singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        try {
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        assert instanceTwo != null;
        System.out.println(instanceTwo.hashCode());
    }
}
