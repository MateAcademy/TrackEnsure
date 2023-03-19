package lesson5.ls10;

import java.lang.annotation.Repeatable;

@Repeatable(DoubleRepeat.class)
@interface Repeat {
    String value();
}


