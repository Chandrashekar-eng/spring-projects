package com.configindia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloClient2 {
public static void main(String[] args) {
@SuppressWarnings("resource")
ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
//first way
HelloWorld obj1=(HelloWorld)ctx.getBean("helloWorld");
obj1.printMessage();

//second way
HelloWorld obj2=ctx.getBean("helloWorld",HelloWorld.class);
obj2.printMessage();

System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());

System.out.println(ctx.containsBean("helloWorld"));//true
System.out.println(ctx.containsBean("employee"));//false
System.out.println(ctx.isSingleton("helloWorld"));//true
System.out.println(ctx.isPrototype("helloWorld"));//false
		
}
}