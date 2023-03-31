package reflection.ex01.model;

import reflection.ex01.annotations.HasHair;

/**
 * @author Sergey Klunniy
 */
@Deprecated
public class AnotherDog extends Dog {

    private void test() {}
    @Deprecated(since = "v.20", forRemoval = true)
    @HasHair
    public void test2() {}

}
