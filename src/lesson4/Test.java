package lesson4;

public class Test {
    public static void main(String[] args) {

        Garage<? super AirPlanNoEngine> garage = new Garage<>();

        //garage.setValue(new AirPlan());
        garage.setValue(new AirPlanNoEngine());
        garage.setValue(new Cesna());
        garage.setValue(new F11());

        Object value = garage.getValue();

    }
}

class AirPlan {}

class AirPlanNoEngine extends AirPlan{}

class Cesna extends AirPlanNoEngine {}

class F11 extends AirPlanNoEngine {}


class Garage<T> {
    private T value;

    public Garage() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Garage(T value) {
        this.value = value;
    }
}
