package lesson1;

/**
 * @author Sergey Klunniy
 */
public class Main2 {
    public static void main(String[] args) {
        Student2 student2 = new Student2();

        Student3<Bag> student3 = new Student3<>();
        Bag myThing = student3.myThing;


        Student4<Long, Long> student4 = new Student4();
        String myThing1 = student4.myThing;
        student4.id = 22L;
        student4.phoneNumber = 911L;

//          Student4 student4 = new Student4();
//          String myThing1 = student4.myThing;

    }
}

class Bag {
}

class Human {
}

class GenHuman<T> extends Human {
    T myThing;
}

class Student1 extends GenHuman {
}

class Student2 extends GenHuman<Bag> {
}

class Student3<T> extends GenHuman<T> {
}

class Student4<T, K> extends GenHuman<String> {
    T id;
    K phoneNumber;
}
