package com.uax.plantilla.util;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.dialect.H2Dialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.uax.plantilla.controller.model.Correos;

@Configuration
public class HibernateConfiguration {

    @Value("#{dataSource}")
    private DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean() {
        Properties props = new Properties();
        props.put("hibernate.dialect", H2Dialect.class.getName());
        props.put("hibernate.format_sql", "true");
        
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setAnnotatedClasses(new Class[]{Correos.class});
        bean.setHibernateProperties(props);
        bean.setDataSource(this.dataSource);
        return bean;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        return new HibernateTransactionManager(sessionFactoryBean().getObject());
    }
}