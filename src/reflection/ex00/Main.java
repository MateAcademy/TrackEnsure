package reflection.ex00;

import java.util.Map;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // 1. getClass()
        SimpleClass simpleClass = new SimpleClass();
        Class<?> cl = simpleClass.getClass();


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

        //4.
        Class<?> cl9 =  Integer.class.getSuperclass();
        System.out.println(cl9);

        //достаю вложенный внутренний класс
        Class<?> cl10 =  Integer.class.getSuperclass();
        Class<?> cl11 =  Map.Entry.class.getEnclosingClass();
        System.out.println(cl11);
    }
}
