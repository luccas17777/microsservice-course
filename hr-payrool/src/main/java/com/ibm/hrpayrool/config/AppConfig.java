package com.ibm.hrpayrool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate getRestTemplate(){ // serve para resgistrar uma instância uníca do tipo RestTemplate
        return new RestTemplate(); // com isso temos uma disposição de um objeto RestTemplate para injetar em outros serviços
    }

}
