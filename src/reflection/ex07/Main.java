package reflection.ex07;

import java.lang.reflect.Modifier;

public class Main {
    private static final class CatModifier {
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        //We get the class that describes the CatModifier
        Class<?> cl = CatModifier.class;
        //Узнаем имя класса
        System.out.println(s + "Class name: " + s1 + cl.getName());
        System.out.println(s + "Modifiers of class: " + s1);

        //getModifiers(), returns an integer value
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.println("private");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isStatic(mods)) {
            System.out.println("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
    }
}
