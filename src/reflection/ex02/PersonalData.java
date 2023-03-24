package reflection.ex02;

import reflection.ex02.annotations.TestAnnotations;

/**
 * @author Sergey Klunniy
 */
public class PersonalData {

    @TestAnnotations
    public static boolean isValidPersonalId() {
        boolean res = idCalculator("1", "22", "333").equals("122333");
        System.out.println("PersonalData is = " + res);
        return res;
    }

    private static String idCalculator(String... personalId) {
        StringBuilder sb = new StringBuilder();
        for (String tmp : personalId) {
            sb.append(tmp);
        }

        return sb.toString();
    }
}
