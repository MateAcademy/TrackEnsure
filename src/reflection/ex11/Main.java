package reflection.ex11;

import reflection.ex11.dao.AnimalDao;
import reflection.ex11.dao.AnimalJdbcDaoImpl;

/**
 * @author Sergey Klunniy
 */
public class Main {

    static {

    }

    //@Inject
    private static AnimalDao animalDao;

    public static void main(String[] args) {
        //..


        AnimalDao animalDao = new AnimalJdbcDaoImpl();
    }

    //...
}
