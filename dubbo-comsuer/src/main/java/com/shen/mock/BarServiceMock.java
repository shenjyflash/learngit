package com.shen.mock;

import com.shen.common.bar.IBarService;

public class BarServiceMock implements IBarService {

	@Override
	public void save(int age) {
		
	}

	@Override
	public String saySomething() {
		
		return "容错数据";
	}

}
