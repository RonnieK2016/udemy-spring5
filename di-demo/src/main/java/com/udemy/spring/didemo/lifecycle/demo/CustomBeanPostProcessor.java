package com.udemy.spring.didemo.lifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof BeanLifecylceDemo) {
            ((BeanLifecylceDemo) bean).preInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof BeanLifecylceDemo) {
            ((BeanLifecylceDemo) bean).afterInit();
        }

        return bean;
    }
}
