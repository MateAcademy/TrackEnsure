package lesson1;

public class Main {
    public static void main(String[] args) {
        Gold gold = new Gold(1000);
        Storage<Gold> storage = new Storage<>(gold);
//        storage.setValue(new Bike());


//        storage.setValue(new Silver());

        Gold value = storage.getValue();
        value.changeOfmany();
//        if(value instanceof Gold) {
//            ((Gold) value).changeOfmany();
//        }





    }
}

class Bike {}

class Silver {

}

class Gold {
    private int massa;

    public Gold(int massa) {
        this.massa = massa;
    }

    public void changeOfmany() {
        System.out.println("У меня " + massa + ", грамм золота обменяны на гривну: " +  massa*50);
    }
}

class Storage<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Storage(T value) {
        this.value = value;
    }
}