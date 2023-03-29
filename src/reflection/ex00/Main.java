package reflection.ex00;

import java.lang.reflect.Constructor;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.
        SimpleClass simpleClass = new SimpleClass();
        Class<?> cl = simpleClass.getClass();

        Constructor<?>[] constructors = cl.getConstructors();

        int [] arr = new int[10];
        Class<?> cl2 = arr.getClass();
        Class<?> cl3 = "hello world".getClass();
        Class<?> cl4 = Integer.valueOf(5).getClass();


        //2. .class
        Class<?> cl5 = SimpleClass.class;
        Class<?> cl6 = int[].class;

        //3. Class.forName()
        Class<?> cl7 = Class.forName("java.lang.String");
        System.out.println(cl7);

        Class<?> cl8 = Class.forName("[I");
        //Class<?> cl8 = Class.forName("[D");
        System.out.println(cl8);

    }
}
