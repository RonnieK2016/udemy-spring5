package com.udemy.spring.didemo.lifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecylceDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public BeanLifecylceDemo() {
        System.out.println("##BeanLifecylceDemo constructor is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##afterPropertiesSet is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##setBeanFactory is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("##setBeanName is called for " + BeanLifecylceDemo.class.getSimpleName() + " with name " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##destroy is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##setApplicationContext is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("##postConstruct is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("##preDestroy is called for " + BeanLifecylceDemo.class.getSimpleName());
    }

    public void preInit() {
        System.out.println("##preInit is called for  " + BeanLifecylceDemo.class.getSimpleName());
    }

    public void afterInit() {
        System.out.println("##afterInit is called for  " + BeanLifecylceDemo.class.getSimpleName());
    }
}
