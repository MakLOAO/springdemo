package com.mkl.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

//    @Value("${url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String userName;
//
//    @Value("${password}")
//    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager() {
//        return new MyDriverManager(url, userName, password);
//    }

//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    public Store getStringStore() {
//        return new StringStore();
//    }
    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    @Bean(name = "GenericTestStore")
    public TestStore testStore() {
        System.out.println("s1: " + s1.getClass().getName());
        System.out.println("s2: " + s2.getClass().getName());
        return new TestStore();
    }
}