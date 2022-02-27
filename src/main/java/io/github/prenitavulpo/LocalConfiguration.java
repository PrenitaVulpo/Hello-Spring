package io.github.prenitavulpo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalConfiguration {

    @Bean
    public CommandLineRunner exec(){
        return args -> System.out.println("Development Build");
    }
}
