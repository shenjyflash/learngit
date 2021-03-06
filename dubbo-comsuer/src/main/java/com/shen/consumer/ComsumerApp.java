package com.shen.consumer;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.shen.common.bar.IBarService;
import com.shen.common.resource.DcResourceEntity;
import com.shen.common.resource.IResourceService;
import com.shen.common.user.IUserService;
import com.shen.common.user.User;


public class ComsumerApp {

	static ClassPathXmlApplicationContext context = null;
	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		demo5();
       
        
	}
	
	public static void demo1(){
		context = new ClassPathXmlApplicationContext("classpath:comsumer_1.xml");
        context.start();
        IUserService demoService = (IUserService)context.getBean("demoService");
        User hello = demoService.getUser("mmm", 12);
        System.out.println("get user:"+ hello.toString());
	}

	/**
	 * 异步调用
	 */
	public static void demo2(){
		context = new ClassPathXmlApplicationContext("classpath:comsumer_2.xml");
        context.start();
        IUserService demoService = (IUserService)context.getBean("demoService");
        System.out.println(demoService.getClass().toString());
        User tom = demoService.getUserLongTime("Tom", 12);
        System.out.println(System.currentTimeMillis()+"tom="+tom);
        Future<User> userFuture = RpcContext.getContext().getFuture();
        User hello = demoService.getUser("mmm", 12); //立即返回调用结果
        System.out.println("get user:"+ hello.toString());
        try {
			tom = userFuture.get();//如果异步调用结果还没有返回，此时线程会挂起
			System.out.println(System.currentTimeMillis()+"tom="+tom);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 本地存根 BarServiceStub在消费者端执行，判断是否执行远端访问
	 */
	public static void demo3(){
		context = new ClassPathXmlApplicationContext("classpath:comsumer_3.xml");
        context.start();
        IBarService demoService = (IBarService)context.getBean("demoService");
        System.out.println(demoService.getClass().toString());
        demoService.save( 12);
	}
	
	/**
	 * 本地伪装，使用mock返回容错数据
	 * 防止消费者抛出RpcException
	 * 
	 */
	public static void demo4(){ 
		context = new ClassPathXmlApplicationContext("classpath:comsumer_4.xml");
        context.start();
        IBarService demoService = (IBarService)context.getBean("demoService");
        System.out.println(demoService.getClass().toString());
        String ss = demoService.saySomething();
        System.out.println(ss);
	}
	
	public static void demo5(){ 
		context = new ClassPathXmlApplicationContext("classpath:comsumer_5.xml");
        context.start();
        IResourceService demoService = (IResourceService)context.getBean("demoService");
        System.out.println(demoService.getClass().toString());
        DcResourceEntity entity = new DcResourceEntity();
        entity.setName("企业管理-2");
        entity.setId(BigInteger.valueOf(2L));
        DcResourceEntity ss = demoService.getDcResourceEntity(entity);
        System.out.println(ss);
	}
}
