package lesson1;

public class Main2 {
    public static void main(String[] args) {
        MyStorage<Gold> myStorage = new MyStorage<>(new Gold(1000));

//        myStorage.setValue(new Silver());

        Object value = myStorage.getValue();
    }
}

class MyStorage<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyStorage(T value) {
        this.value = value;
    }
}