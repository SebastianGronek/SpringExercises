package com.example.Exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Tak, required args constructor pewnie by wystarczył, bo @Autowired nie jest konieczne w tym wypadku
@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {


    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }

    @Autowired
    public CommandLineRunnerWithConstructorInjection(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}