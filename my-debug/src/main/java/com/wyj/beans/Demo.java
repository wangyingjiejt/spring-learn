package com.wyj.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {


	/**
	 * 使用注解的方式获取bean信息
	 * @author W.Y.J
	 * @Date 2021/2/1 17:27
	 */
	@Test
	public void test1(){
		//1.通过包名扫描
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.wyj");
		//2、指定类
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names){
			System.out.println(beanName);
		}
	}


	/**
	 * 使用xml方式获取bean信息
	 * @author W.Y.J
	 * @Date 2021/2/1 17:31
	 */
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());


	}
}
