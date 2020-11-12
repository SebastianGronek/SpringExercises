package com.example.Exercise1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Slf4j
public class BeanConfiguration {

    @Bean
    @Primary
    public DummyLogger primaryLogger() {
     return log::info;
    }

    @Bean
    public DummyLogger secondaryLogger() {
        return log::info;
    }


}
