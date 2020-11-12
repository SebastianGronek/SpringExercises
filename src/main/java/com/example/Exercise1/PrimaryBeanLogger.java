package com.example.Exercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrimaryBeanLogger implements CommandLineRunner {


    private final DummyLogger dummyLogger;

    public PrimaryBeanLogger(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello("Hello from primary logger");
    }
}
