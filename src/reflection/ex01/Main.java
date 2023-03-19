package reflection.ex01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Main {

    public static void main(String[] args) {
        try {
            AnotherDog anotherDog = new AnotherDog();
            Class<? extends AnotherDog> cl = anotherDog.getClass();

            //вытаскиваю все аннотации класса, у нас их всего две:
            Annotation[] annotations = cl.getAnnotations();
            if (annotations.length > 0) {
                System.out.println("Вывожу все аннотации класса AnotherDog:");
                for (Annotation annotation : annotations) {
                    System.out.println("\t" + annotation);
                }
            }

            //хочу показать что методом getDeclaredMethods считываю даже имена приватных методов
            Method[] declaredMethods = cl.getDeclaredMethods();
            if (declaredMethods.length > 0) {
                System.out.println("\nВывожу все методы класса AnotherDog:");
                for (Method method : declaredMethods) {
                    System.out.println("\t" + method);
                }
            }


            Method[] classMethods = cl.getMethods();
            System.out.println("\nВывожу все Аннотации над методами в классе AnotherDog:");
            for (Method method : classMethods) {
                Annotation[] methodAnnotation = method.getAnnotations();
                if (methodAnnotation.length > 0) {
                    System.out.println("имя метода: " + method.getName());
                    System.out.println("\tи аннотации над ним: " + Arrays.toString(methodAnnotation));
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
