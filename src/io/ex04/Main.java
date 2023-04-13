package io.ex04;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        FileInputStream fileInputStream;



        try {
            fileInputStream = new FileInputStream("/home/user/dev/GitHub/src/io/ex04/index.txt");

            int a ;

            while ((a = fileInputStream.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        }






        try {
            FileOutputStream fs = new FileOutputStream("/home/user/dev/GitHub/src/io/ex04/index.txt", true);
            fs.write("\nnew line here".getBytes() );
        } catch (FileNotFoundException e) {} catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
