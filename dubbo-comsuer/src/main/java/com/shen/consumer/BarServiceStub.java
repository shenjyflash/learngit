package com.shen.consumer;

import com.shen.common.bar.IBarService;

public class BarServiceStub implements IBarService {

	private final IBarService barService;
	
	public BarServiceStub(IBarService barService){
		this.barService = barService;
	}
	
	public void save(int age) {
		// TODO Auto-generated method stub
		System.out.println("BarServiceStub");
		if(age>1){
			barService.save(age);
		}else{
			System.out.println("not invoke real save");
		}
	}

}
