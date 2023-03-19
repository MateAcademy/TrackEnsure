package reflection.ex01;

import reflection.ex01.annotations.HasHair;
import reflection.ex01.annotations.Quolity;
import reflection.ex01.enums.Color;

import java.lang.annotation.Documented;

/**
 * @author Sergey Klunniy
 */
@Quolity(color = Color.GREY, sound = "Classic")
public class Dog {

    @HasHair
    public void hair () {
        String str = "";
    }
}
