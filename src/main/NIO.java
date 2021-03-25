package main;

import java.nio.file.Path;

public class NIO {
    public static void main(String[] args) {
        Path p = Path.of("App.java");
        System.out.println(p.endsWith("App.java"));
    }
}
