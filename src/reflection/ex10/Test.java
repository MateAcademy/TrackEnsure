package reflection.ex10;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author Sergey Klunniy
 */
public class Test {
        public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
                ArrayList<Integer> arrayList = new ArrayList<>();
                System.out.println(capacity(arrayList));
        }

        private static int capacity(ArrayList<?> arrayList) throws NoSuchFieldException, IllegalAccessException {
                Class<?> cl = ArrayList.class;
                Field elementData = cl.getDeclaredField("elementData");
                elementData.setAccessible(true);
                Object o = elementData.get(arrayList);
                return ((Object[])o).length;



        }
}
