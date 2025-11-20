package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //load Beans.xml
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Car car = context.getBean(Car.class);
        car.drive();
    }
}

