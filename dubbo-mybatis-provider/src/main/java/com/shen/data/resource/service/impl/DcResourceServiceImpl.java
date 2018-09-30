package com.shen.data.resource.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.shen.common.resource.DcResourceEntity;
import com.shen.data.resource.dao.IResourceDao;
import com.shen.data.resource.service.DcResourceService;

 /**
 * 描述：</b><br>
 * @author：shenjy
 * @version:1.0
 */
@Transactional
@Component   
public class DcResourceServiceImpl implements DcResourceService {
	@SuppressWarnings("unused")
	private final static Logger log= LoggerFactory.getLogger(DcResourceServiceImpl.class);
	
	@Autowired
	private IResourceDao resourceDao;

	@Override
	public DcResourceEntity get(DcResourceEntity entity) {
		// TODO Auto-generated method stub
		return resourceDao.findByPriKey(entity);
	}

	@Override
	public void update(DcResourceEntity entity) {
		// TODO Auto-generated method stub
		resourceDao.update(entity);
	}
}
