package com.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.out.println( "Dubbo Service is Started!" );
        System.in.read();
	}

}
