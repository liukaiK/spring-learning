package com;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactoryTest {


    @Test
    public void springTest() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml", this.getClass().getClassLoader()));

        beanFactory.getBean("myTestBean");

        beanFactory.getBean("myTestBean");

        beanFactory.getBean("&car");

        beanFactory.getBean("car");


    }


    @Test
    public void readProperties() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println(properties.get("server.port"));
    }

}
