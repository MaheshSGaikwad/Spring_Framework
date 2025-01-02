package com.example.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * This is second way of creating the Java lifecycle hooks
 */
@Component
public class JavaLifecycleHooks {
    @PostConstruct
    public void init(){
        System.out.println("Inside init JavaLifecycleHooks");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Inside destroy JavaLifecycleHooks");
    }
}
