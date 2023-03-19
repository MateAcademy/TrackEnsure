package lesson5.ls06;

/**
 * @param  @SafeVarargs - эта аннотация контролирует безопасность Varargs
 */
public class Main {

    //@SafeVarargs
    private People people;


    @SafeVarargs
    public static void main(String... args) {

    }

    @SafeVarargs
    private static final void test(int... ints) {}
}

class People{}
