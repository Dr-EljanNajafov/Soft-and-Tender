package com.security.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "com.security")
@EnableWebMvc
public class MyConfig {

    /**
     * Сокращение для имен jsp файлов.
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();

        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");

        return internalResourceViewResolver;
    }

    /**
     * DataSource бин - для работы с3p0 и БД
     */
    @Bean    //настройка бина dataSource
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("org.postgresql.Driver");
            dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/softandtender?useSSL=false&amp;serverTimezone=UTC");
            dataSource.setUser("postgres");
            dataSource.setPassword("admin123");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        return dataSource;
    }
}
