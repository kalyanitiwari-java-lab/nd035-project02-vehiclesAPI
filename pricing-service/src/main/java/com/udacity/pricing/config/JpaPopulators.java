package com.udacity.pricing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

import com.udacity.pricing.domain.price.Price;

@Configuration
public class JpaPopulators {

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulator() throws Exception {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[]{new ClassPathResource("prices.json")});
        return factory;
    }
}