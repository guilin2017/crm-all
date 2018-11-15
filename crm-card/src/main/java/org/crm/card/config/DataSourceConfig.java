package org.crm.card.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
	private static Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
    @Bean(name="dataSource")
    @ConfigurationProperties(prefix ="spring.datasource.main")
    public DataSource mainDataSource() {
        return DataSourceBuilder.create().build();
    }
}