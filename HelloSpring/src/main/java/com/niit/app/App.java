package com.niit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.classPathXmlApplicationContext;

public class App{

 public static void main(String [] args){
//1. Start the Container ApplicationContext Context=new ClassPathXmlApplicationContext("beans.xml");

//2 Get the bean(Notice: No"new Greeting()" here!)

Greetings greet= (Greetings) context.getBean("myGreetings");
//3. use it
greet.sayHello();
 }
}

