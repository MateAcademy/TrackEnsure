package reflection.ex02;

import reflection.ex02.annotations.TestAnnotations;

/**
 * @author Sergey Klunniy
 */
public class UniversityGroup {

    @TestAnnotations
    public static boolean isCorrectNumberOfGroups() {
        boolean res = groupsCalculator(1, 2, 3, 4) == 10;
        System.out.println("UniversityGroupsNumber is = " + res);
        return res;
    }

    private static long groupsCalculator(long... numberGroups) {
        long res = 0;
        for (long tmp : numberGroups) {
            res += tmp;
        }
        return res;
    }
}
