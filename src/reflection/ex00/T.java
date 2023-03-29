package reflection.ex00;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class T {
    public static void main(String[] args) {
        Function<Integer, Integer> p = y -> 5+5;

        IntFunction<Integer> yy = y -> 5+5;

        Predicate<String> st = "hello"::startsWith;


        //Consumer<>
    }
}
