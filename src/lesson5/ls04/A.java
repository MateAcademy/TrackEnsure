//package lesson5.ls04;
//
///**
// * static поля и методы находятся в java 7 в permGeneration, а в java 8 переименовали в метаспейс, за счет чего можно расширять динамически
// * в эту область памяти помещаются static, class, annotations, enums, метаданные.
// */
//public class A {
//    // что будет если я допишу слово static
//    byte b = 6;
//
//
//}
//
//class B extends A {
//
//    byte b = 60;
//
//    public void print() {
//
//        System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        A a = new B();
//        a.print(); //Что выведется на экран?
//        System.out.println(a.b);
//    }
//}
