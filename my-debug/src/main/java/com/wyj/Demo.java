package com.wyj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {


	@Test
	public void test1(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names){
			System.out.println(beanName);
		}
	}

	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());

	}
}
