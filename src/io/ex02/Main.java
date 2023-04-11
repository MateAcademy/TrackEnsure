package io.ex02;

import java.util.Scanner;

/**
 * Three interfaces are very important for stream classes: Closeable and Flushable, and AutoCloseable
 */
public class Main {
    public static void main(String[] args) {
        try (Test scanner = new Test()){

        } catch (Exception e) {}
    }
}
