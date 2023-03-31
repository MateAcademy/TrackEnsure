package reflection.ex08;

import java.lang.reflect.Field;

public class Main {
    private static final class Dog {
        private int age = 3;
    }

    public static void main(String[] args) {
        try {
            Class<?> cl = Dog.class;
            Dog dog = new Dog();

            // By the name "name" we get the class Field
            Field field = cl.getDeclaredField("age");
            // true - remove the modifier to public, false - disable
            field.setAccessible(true);
            // The Field class has various get methods
            System.out.println("Private field value: " + field.getInt(dog));
            field.setInt(dog, 10);
            System.out.println("New private field value: " + field.getInt(dog));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
