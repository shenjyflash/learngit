package com.export.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.shen.common.resource.DcResourceEntity;
import com.shen.common.resource.IResourceService;
import com.shen.data.resource.service.DcResourceService;
@Component  
@Service 
@Transactional
public class ResourceServiceImpl implements IResourceService {
	

	@Autowired
	private DcResourceService dcResourceService;
	
	
	
	public DcResourceEntity getDcResourceEntity(DcResourceEntity entity ){
		dcResourceService.update(entity);
		Integer.parseInt("ss");
		return dcResourceService.get(entity);
	}
	
}
