package lesson1;

/**
 * @author Sergey Klunniy
 */
public interface Flyable<T> {
    T getFlyModel();
}

class Aircraft<T> implements Flyable {

    T weightPlanner;

    @Override
    public Object getFlyModel() {
        return null;
    }
}
