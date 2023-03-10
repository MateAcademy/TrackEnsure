package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * контейнеры, ограниченные по верхней границе, могут только предоставлять объекты,
 * а контейнеры, ограниченные по нижней границе, являются только потребителями.
 *
 * List<? extends Class3> list  - из данного списка можно получить только объекты суперклассов, а лежат в нем только обьекты наследников.
 */
public class Main4 {
    public static void main(String[] args) {


        //Collections.copy();

        List<? extends Class3> class3s = new ArrayList<>();
//        class3s.add(new Class4());
//        class3s.add(new Class3());

        List<? extends Class3> list2 = class3s;

                List<? extends Class3> list = new ArrayList<>() {{
//            add(new Class1());
            add(new Class4());
            add(new Class3());
        }} ;


//        list.add(new Class0());
//        list.add(new Class1());
//        list.add(new Class2());
//        list.add(new Class3());

        Class0 cl0 =  list.get(0);
        Class1 cl1 =  list.get(0);
        Class3 cl3 =  list.get(0);
//        Class2 cl2 =  list.get(0);
    }
}

class Class0 {}

class Class1 extends Class0 {}

class Class2 extends Class1 {}

class Class3 extends Class1 {
    public void test(){
        System.out.println("test class3");
    }
}
class Class4 extends Class3 {}
class Class5 extends Class4 {}




