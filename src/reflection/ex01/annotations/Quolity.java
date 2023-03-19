package reflection.ex01.annotations;

import reflection.ex01.enums.Color;

import java.lang.annotation.*;

import static reflection.ex01.enums.Color.ROSE;

/**
 * @author Sergey Klunniy
 */

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Quolity {

    Color[] color() default ROSE;
    String sound() default "мяу";
}
