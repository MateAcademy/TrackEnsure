package lesson5.ls09;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * мы не можем в паннотации передавать обьекты например new String();
 * Object o();
 *
 * все параметры должны быть константами по дефолту
 *
 * Можно добавать еще в ElementType элементов: {ElementType.METHOD, ElementType.FIELD, ElementType.TYPE}
 */

@Deprecated
@Inherited
@Target(ElementType.METHOD)
public @interface MyAnnotation {

    String s = new String("ddd");
    Integer a = 5;

    String str() default "Hello";
    int i() default 10 + 10;

    enum MyEnum {
        BLACK, WHITE, READ, GREEN, ORANGE
    }
}
