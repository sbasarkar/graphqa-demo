package com.demo.graphql.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = { "com.demo.graphql.dao" })
@EnableTransactionManagement
public class PersistenceConfig {

}
