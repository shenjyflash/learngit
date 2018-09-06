package com.shen.provider.user;

import com.shen.common.bar.IBarService;

public class BarService implements IBarService {

	public void save(int age) {
		System.out.println("real save");
	}

}
