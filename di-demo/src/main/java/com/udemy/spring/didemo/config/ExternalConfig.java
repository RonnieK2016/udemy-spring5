package com.udemy.spring.didemo.config;

import com.udemy.spring.didemo.datasources.FakeDatasource;
import com.udemy.spring.didemo.email.FakeEmailAccountProvider;
import com.udemy.spring.didemo.jms.FakeJmsProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource(value = "datasource.properties"),
    @PropertySource(value = "jms.properties")
})
public class ExternalConfig {

    @Value("${spring.udemy.ds.username}")
    private String dsUserName;

    @Value("${spring.udemy.ds.password}")
    private String dsPassword;

    @Value("${spring.udemy.ds.url}")
    private String dsUrl;

    @Value("${spring.udemy.jms.username}")
    private String jmsUserName;

    @Value("${spring.udemy.jms.password}")
    private String jmsPassword;

    @Value("${spring.udemy.jms.url}")
    private String jmsUrl;

    @Value("${spring.udemy.email.username}")
    private String emailUsername;

    @Value("${spring.udemy.email.password}")
    private String emailPassword;
    @Value("${spring.udemy.email.url}")
    private String emailUrl;
    @Value("${spring.udemy.email.protocol}")
    private String emailProtocol;

    @Bean
    public FakeDatasource getFakeDatasource() {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(this.dsUserName);
        fakeDatasource.setPassword(this.dsPassword);
        fakeDatasource.setUrl(this.dsUrl);
        return fakeDatasource;
    }

    @Bean
    public FakeJmsProvider getFakeJmsProvider() {
        FakeJmsProvider fakeJmsProvider = new FakeJmsProvider();
        fakeJmsProvider.setUserName(this.jmsUserName);
        fakeJmsProvider.setPassword(this.jmsPassword);
        fakeJmsProvider.setUrl(this.jmsUrl);
        return fakeJmsProvider;
    }

    @Bean
    public FakeEmailAccountProvider getFakeEmailAccountProvider() {
        FakeEmailAccountProvider fakeEmailAccountProvider = new FakeEmailAccountProvider();
        fakeEmailAccountProvider.setUsername(this.emailUsername);
        fakeEmailAccountProvider.setPassword(this.emailPassword);
        fakeEmailAccountProvider.setServerUrl(this.emailUrl);
        fakeEmailAccountProvider.setProtocol(this.emailProtocol);
        return fakeEmailAccountProvider;
    }

}
