package reflection.ex09;

import java.lang.reflect.Member;

public class Main9 {

    private static int count = 0;
    public static void main(String[] args) {
        try {
            // Get an object of type class
            Class<?> c = Class.forName(args[0]);
            System.out.println(c);

            // Calling all fields of the class
             printMembers(c.getFields());

            // Calling all class constructors
            printMembers(c.getConstructors());

            //Calling all class methods
             printMembers(c.getMethods());
        } catch (ClassNotFoundException e) {
            System.out.println("Unknown class " + args[0]);
        }
    }

    private static void printMembers(Member[] mems) {
        // Walking the length of the Member interface
        for (int i = 0; i < mems.length; i++) {
            if (mems[i].getDeclaringClass() == Object.class) {
                continue;
            }
            String decl = mems[i].toString();
            System.out.print("      ");
            System.out.println(++count + "       " + decl);
        }
    }
}
