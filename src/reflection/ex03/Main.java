package reflection.ex03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Sergey Klunniy
 */
public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Calc calc = new Calc();

        Class<?> cl = calc.getClass();

        Method[] declaredMethods = cl.getDeclaredMethods();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length > 0) {
                method.invoke(calc, 5, 5);
            } else {
                method.invoke(calc, new Object[]{});
            }
        }
    }
}
