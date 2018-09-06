package com.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		demo2();
		System.in.read();
	}
	
	/**
	 * 基本demo
	 */
	public static void demo1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider_1.xml");
        context.start();
        System.out.println( "Dubbo Service is Started!" );
	}
	
	/**
	 * 不向注册中心注册
	 */
	public static void demo2(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider_2.xml");
        context.start();
        System.out.println( "Dubbo Service is Started!" );
	}
	
	/**
	 * 本地存根使用
	 */
	public static void demo3(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider_3.xml");
        context.start();
        System.out.println( "Dubbo Service is Started!" );
	}

}