package org.rugbedbugg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev obj = (Dev) context.getBean("dev");
        Dev obj1 = (Dev) context.getBean("dev1");
        Computer comp = (Computer) context.getBean("lap");

        System.out.println("Developer 1 age     : " + obj.getAge_var());
        System.out.println("Developer 1 salary  : " + obj.getSalary_var());
        System.out.println("Developer 2 age     : " + obj1.getAge_var());
        System.out.println("Developer 2 salary  : " + obj1.getSalary_var());
        System.out.println("Laptop Mfd. Year    : " + comp.getManufacturedYear_var());
        System.out.println();

        obj.setAge_var(20);
        obj1.setAge_var(21);
        obj.setSalary_var(30000);
        obj1.setSalary_var(30001);
        comp.setManufacturedYear_var(2025);

        System.out.println("Developer 1 age     : " + obj.getAge_var());
        System.out.println("Developer 1 salary  : " + obj.getSalary_var());
        System.out.println("Developer 2 age     : " + obj1.getAge_var());
        System.out.println("Developer 2 salary  : " + obj1.getSalary_var());
        System.out.println("Laptop Mfd. Year    : " + comp.getManufacturedYear_var());
        System.out.println();

        obj.build();
    }
}
