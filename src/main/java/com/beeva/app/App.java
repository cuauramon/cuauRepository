package com.beeva.app;

import com.beeva.app.utils.Calculadora;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String [] {
        "holaMundo-context.xml"});        
        Calculadora calculadora= context.getBean("calculadora", Calculadora.class);
        calculadora.imprimirArea();
        
        ((AbstractApplicationContext) context).close();
           
           ApplicationContext context1 = new ClassPathXmlApplicationContext(new String [] {
        "holaMundo-context.xml"});        
        Calculadora calculadora1= context.getBean("calculadora", Calculadora.class);
        calculadora.imprimirArea();
        ApplicationContext context2 = new ClassPathXmlApplicationContext(new String [] {
        "holaMundo-context.xml"});        
        Calculadora calculadora2= context.getBean("calculadora", Calculadora.class);
        calculadora.imprimirArea();
        ApplicationContext context3 = new ClassPathXmlApplicationContext(new String [] {
        "holaMundo-context.xml"});        
        Calculadora calculadora3= context.getBean("calculadora", Calculadora.class);
        calculadora.imprimirArea();
        ApplicationContext context4 = new ClassPathXmlApplicationContext(new String [] {
        "holaMundo-context.xml"});        
        Calculadora calculadora4= context.getBean("calculadora", Calculadora.class);
        calculadora.imprimirArea();
              
    }
}
