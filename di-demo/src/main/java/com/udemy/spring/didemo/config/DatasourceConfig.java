package com.udemy.spring.didemo.config;

import com.udemy.spring.didemo.datasources.FakeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "datasource.properties")
public class DatasourceConfig {

    @Value("${spring.udemy.ds.username}")
    private String userName;

    @Value("${spring.udemy.ds.password}")
    private String password;

    @Value("${spring.udemy.ds.url}")
    private String url;

    @Bean
    public FakeDatasource getFakeDatasource() {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(this.userName);
        fakeDatasource.setPassword(this.password);
        fakeDatasource.setUrl(this.url);
        return fakeDatasource;
    }

}
