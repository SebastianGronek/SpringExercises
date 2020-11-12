package com.example.Exercise1;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BothBeansLogger implements CommandLineRunner {
    final List<DummyLogger> dummyLoggers;

    public BothBeansLogger(List<DummyLogger> dummyLoggers) {
        this.dummyLoggers = dummyLoggers;
    }
    @Override
    public void run(String... args) throws Exception {
        dummyLoggers.forEach(DummyLogger -> DummyLogger.sayHello("Hello from both loggers"));
    }
}
