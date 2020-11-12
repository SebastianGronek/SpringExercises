package com.example.Exercise1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondaryBeanLogger implements CommandLineRunner {

    @Qualifier("secondaryLogger")
    private final DummyLogger dummyLogger;

    public SecondaryBeanLogger( final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello("Hello from secondary logger");
    }
}
