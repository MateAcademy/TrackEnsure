package io.ex00;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] roots = File.listRoots();

        for (File file : roots) {
            System.out.println(file);
        }
    }
}
