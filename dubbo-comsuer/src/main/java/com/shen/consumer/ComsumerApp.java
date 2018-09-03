package com.shen.consumer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.shen.common.user.IUserService;
import com.shen.common.user.User;


public class ComsumerApp {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:comsumer.xml");
        context.start();
        System.out.println( RpcContext.getContext().getLocalHost());
        System.out.println( "Dubbo Comsumer is Started!" );
        RpcContext.getContext().setAttachment("index", "indedx");
        IUserService demoService = (IUserService)context.getBean("demoService2"); // 
       
        User hello = demoService.getUser("mmm", 12); //
        
	       System.out.println(">>>>>>>"+hello);
	       Future<User> fooFuture = RpcContext.getContext().getFuture();
	       hello =  fooFuture.get();
	       System.out.println("//////////////////"+hello);
	}

}
