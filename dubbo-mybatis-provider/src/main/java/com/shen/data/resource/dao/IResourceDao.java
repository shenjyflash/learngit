package com.shen.data.resource.dao;

import com.shen.common.resource.DcResourceEntity;

public interface IResourceDao {
	
	public DcResourceEntity findByPriKey(DcResourceEntity temp);
	
}
