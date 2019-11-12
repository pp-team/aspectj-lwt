package com.ppy.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;

@SpringBootApplication
@Configuration
@EnableSpringConfigured
@EnableLoadTimeWeaving
@ImportResource(value = {"classpath:facade-config.xml"})
public class HttpApplication {
    @Bean
    public InstrumentationLoadTimeWeaver loadTimeWeaver() throws Throwable {
        InstrumentationLoadTimeWeaver loadTimeWeaver = new InstrumentationLoadTimeWeaver();
        return loadTimeWeaver;
    }
    public static void main(String[] args) {
        SpringApplication.run(HttpApplication.class, args);
    }
}