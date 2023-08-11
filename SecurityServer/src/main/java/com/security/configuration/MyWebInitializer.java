package com.security.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Реализация диспетчер сервлета
 */
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    /**
     * Указываем где храняться наши конфиги
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    /**
     * Указываем домашний адрес
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
