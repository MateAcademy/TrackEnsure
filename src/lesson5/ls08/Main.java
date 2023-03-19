package lesson5.ls08;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * Рассказать про создание своих аннотаци:
 * Символ @ - указывает компилятору, что обьявлена аннотация.
 * Методы, обьявленные в аннотации public abstract
 */
public class Main {

    @Inject(value = "test")
    public void test() {

    }


}

@Documented
@Inherited //аннотация применима ко всем классам в одной иерархии
@Target(ElementType.METHOD)
@ interface Inject {
    String value();
    String str() default "N/A";
    int val() default 5;
}
