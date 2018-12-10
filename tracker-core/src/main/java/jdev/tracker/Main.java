package jdev.tracker;

import jdev.InjectionContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jdev on 07.03.2017.
 */
@SpringBootApplication
public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectionContext.class);


    }
}
