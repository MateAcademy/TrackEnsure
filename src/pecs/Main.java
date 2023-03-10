package pecs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(){{
            add("hello");
            add("hello2");
        }};

        ArrayList<String> list2 = new ArrayList<>(1);
        list2.add("45");
        list2.add("55");
        list2.add("78");

        Collections.copy(list2, list);

        System.out.println(list2);



//        Container<? extends Planner> container = new Container<Planner>() {{
////                setValue(new Aircraft());
//                setValue(new Planner());
//                setValue(new Boeing());
//        }};
//
//        container.setValue(new Aircraft());
//        container.setValue(new Planner());
//        container.setValue(new Cesna());
//
//        List<? extends Planner> container2 = new ArrayList<>(){{
////            add(new Aircraft());
//            add(new Planner());
//            add(new Boeing());
//        }} ;
//
//
//        System.out.println(container);
//        System.out.println(container2);

    }
}

interface Fly {
    void fl();
}

class Aircraft {
}

class Planner extends Aircraft {
}

class Boeing extends Planner {
}

class Cesna extends Planner {
}

class Container<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

//    public Container(T value) {
//        this.value = value;
//    }
}