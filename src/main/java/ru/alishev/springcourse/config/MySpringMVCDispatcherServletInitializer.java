package ru.alishev.springcourse.config;
/**
 взамен web.xml
*/

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // указываем где лежит конфигурация
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // все запросы от пользователя направляются на dispatcherServlet
    }
}
