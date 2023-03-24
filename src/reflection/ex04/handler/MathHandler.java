package reflection.ex04.handler;

import reflection.ex04.annotation.Math;

/**
 * @author Sergey Klunniy
 */
public class MathHandler {

    @Math(num1 = 10, num2 = 30)
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
