package com.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * помечаем класс, как класс ответсвенный за конфигурацию
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //Указываем то, что все данные о юзерах хрантся в БД
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(
                        "SELECT first_name, password, enabled FROM \"products\".customers WHERE first_name=?")
                .authoritiesByUsernameQuery(
                        "SELECT first_name, authority FROM \"products\".customers WHERE first_name=?");
    }

    /**
     * Метод для разграничения доступа по ролям
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("DEVELOPER", "USER")
                .antMatchers("/developer_info").hasRole("DEVELOPER")
                .antMatchers("/user_info").hasRole("USER")
                .and().formLogin().permitAll();  //запрос формы у всех
    }
}

