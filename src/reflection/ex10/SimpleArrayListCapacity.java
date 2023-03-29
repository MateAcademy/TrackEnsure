package reflection.ex10;

import lesson5.ls05.A;
import reflection.ex00.T;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SimpleArrayListCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList();
        System.out.println(capacity(arrayList));

        arrayList.add(1);
        System.out.println(capacity(arrayList));

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(capacity(arrayList));
    }

    private static int capacity(ArrayList<?> arrayList) throws NoSuchFieldException, IllegalAccessException {
        //elementData отвечает за буфер и возвращает capacity
        Field dataField = ArrayList.class.getClass().getDeclaredField("elementData");
        dataField.setAccessible(true);
        int anInt = ((Object[]) dataField.get(arrayList)).length;
        return anInt;
    }

}
