package reflection.ex04;

import reflection.ex04.annotation.Math;
import reflection.ex04.handler.MathHandler;

import java.lang.reflect.Method;
import java.util.NoSuchElementException;

/**
 * @author Sergey Klunniy
 */
public class Dispatcher {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        try {
            Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
            Math math = m.getAnnotation(Math.class);

            mathHandler.addTwoNumbers(math.num1(), math.num2());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
