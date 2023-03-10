package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
//        Storage<? extends Cloass2> storage = new Storage<>(new Cloass2());
//        storage.setValue(new Cloass0());
//        storage.setValue(new Cloass1());
//        storage.setValue((<? extends Cloass2>) new Cloass2());
//        storage.setValue(new Cloass3());
        getViolationListByRuleSet();

    }
    private static <T extends Class1, V> List<T> getViolationListByRuleSet(){
        List<T> violationList = new ArrayList<>();

        List<Class2> list2 = new ArrayList<>();
        List<Class3> list3 = new ArrayList<>();
//        List<Class1> list1 = new ArrayList<>();
//        violationList.addAll((List<T>)new Cloass0());
//        violationList.addAll((List<T>)new Cloass1());
        violationList.addAll((List<T>)list2);
        violationList.addAll((List<T>)list3);


        System.out.println(violationList);
        return  violationList;
    }
}

class Class1 {}
class Class2 extends Class1 {}
class Class3 extends Class2{}