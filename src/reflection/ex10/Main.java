package reflection.ex10;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        System.out.println(capacity(arrayList));

        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }
        System.out.println(capacity(arrayList));
    }

    private static int capacity(ArrayList<?> al) throws IllegalAccessException, NoSuchFieldException {
        //отвечает за буфер
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(al)).length;

    }
}
