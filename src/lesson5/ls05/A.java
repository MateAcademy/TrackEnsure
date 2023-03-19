package lesson5.ls05;

/**
 * Рассказать про аннотацию @Deprecated
 */
public class A {
    public void print() {
        System.out.println("A");
    }
}

@Deprecated
class B extends A {


    public @Deprecated void print(@Deprecated int a) {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print(); //Что выведется на экран?
    }
}
