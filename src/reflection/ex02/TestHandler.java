package reflection.ex02;

import reflection.ex02.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author Serhii Klunniy
 */
public class TestHandler {
    public static boolean test (Class<?>... ls) {
        try {
            for (Class<?> cl : ls) {
                //We get a list of methods, absolutely all access modifiers
                Method[] methods = cl.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class)) {
                        Boolean b = (Boolean) method.invoke(null, new Object[]{});

                        if (!b) {
                            return false;
                        }

                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
}
