package reflection.ex02;

import reflection.ex02.annotations.TestAnnotations;

import java.lang.reflect.Method;

/**
 * @author Sergey Klunniy
 */
public class TestHandler {
    public static boolean test (Class<?>... ls) {
        try {

            for (Class<?> cl : ls) {
                //Получаем список методов, абсолютно все модификаторы доступа
                Method[] methods = cl.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(TestAnnotations.class)) {
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
