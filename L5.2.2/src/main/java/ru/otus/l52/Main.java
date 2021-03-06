package ru.otus.l52;

import ru.otus.l52.annotations.DebugCode;
import ru.otus.l52.annotations.GenerateResource;

/**
 * Created by tully.
 *
 * To use preprocessor:
 * mvn package install
 * for L5.2.1
 *
 */
@GenerateResource(message = "Hello Java 5.2", file = "MainResource.txt")
//@DebugCode(comment = "Do not use in production")
public class Main {
    public static void main(String... args) {
        String a = "";
        log(a);
    }

    //@DebugCode(comment = "Remove me!")
    private static void log(String str) {
        System.out.println(str);
    }
}
