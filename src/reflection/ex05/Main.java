package reflection.ex05;

import java.lang.reflect.Field;

public class Main {
    private final static class CatFields {
        public String name = "Marsel";
        protected long tail = 30;
        short ears = 5;
        private int age = 7;
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        // We get a class that describes the CatMethods class
        Class<?> cl = CatFields.class;
        System.out.println(s2 + "Public Reflection fields:");
//        // getFields() method, returns only fields with the public modifier
          Field[] fields = cl.getFields();
        // Looping through the Field class and displaying all public fields

        for (Field field : fields) {
            System.out.println(field +"\n");
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }

        System.out.println(s + "\nAll Modifiers Reflection fields:");

        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(s1 + field);
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName() + "\n");
        }

    }
}
