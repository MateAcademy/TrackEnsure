package lesson5.ls09;

import static lesson5.ls09.MyAnnotation.a;

public class A {

    //могу ли я убрать str?
    @MyAnnotation(str = "test", i = 20)
    public void print() {



        System.out.println(a);
    }
}
