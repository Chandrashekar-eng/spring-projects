package com.configindia;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//@RestController
public class HelloClient1 {

	public static void main(String[] args) {
		Resource res= new ClassPathResource("spring.xml");
		BeanFactory factory= new XmlBeanFactory(res);
		
		//first way
		HelloWorld obj1=(HelloWorld)factory.getBean("helloWorld");
		obj1.printMessage();
		System.out.println(obj1.hashCode());
		
		//second way
		HelloWorld obj2=factory.getBean("helloWorld",HelloWorld.class);
		obj2.printMessage();
		
		System.out.println(factory.containsBean("helloWorld"));//true
		System.out.println(factory.containsBean("employee"));//false
		System.out.println(factory.isSingleton("helloWorld"));//true
		System.out.println(factory.isPrototype("helloWorld"));//false
	}
}

