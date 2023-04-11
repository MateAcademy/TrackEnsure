//package reflection.ex01;
//
//import reflection.ex01.model.AnotherDog;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//
///**
// * @author Serhii Klunniy
// * In this example, I am outputting all the annotations above the class,
// * все поля класса и все аннотации над полями
// *
// * Reflection is a mechanism for examining data about a program during its execution.
// * Libraries and frameworks are written through reflection
// */
//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            AnotherDog anotherDog = new AnotherDog();
//            Class<? extends AnotherDog> cl = anotherDog.getClass();
//
//            // I pull out all the class annotations, we have only two of them:
//            Annotation[] annotations = cl.getAnnotations();
//            if (annotations.length > 0) {
//                System.out.println("I display all the annotations of the class AnotherDog:");
//                for (Annotation annotation : annotations) {
//                    System.out.println("\t" + annotation);
//                }
//            }
//
//            // I want to show that with the getDeclaredMethods method I even read the names of private methods
//            Method[] declaredMethods = cl.getDeclaredMethods();
//            if (declaredMethods.length > 0) {
//                System.out.println("\nDisplaying all methods of the AnotherDog class:");
//                for (Method method : declaredMethods) {
//                    System.out.println("\t" + method);
//                }
//            }
//
//            Method[] classMethods = cl.getDeclaredMethods();
//            System.out.println("\nI display all Annotations on methods in the AnotherDog class:");
//            for (Method method : classMethods) {
//                method.setAccessible(true);
//                Annotation[] methodAnnotation = method.getDeclaredAnnotations();
//                if (methodAnnotation.length > 0) {
//                    System.out.println("method name: " + method.getName());
//                    System.out.println("\tand annotations above it: " + Arrays.toString(methodAnnotation));
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
