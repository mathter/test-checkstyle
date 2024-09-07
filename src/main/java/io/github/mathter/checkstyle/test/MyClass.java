package io.github.mathter.checkstyle.test;

import java.util.function.Supplier;

public class MyClass {
    private String text;

    public void f() {
        var s = "Hello";
        this.text = s;
        var f = (Supplier<String>) () -> "hi";
        if (s != null) {
            System.out.println(f.get());
        }
        System.out.println(s);

        try {
            System.out.println(s);
        } finally {
            System.out.println("Hi");
        }
    }
}
