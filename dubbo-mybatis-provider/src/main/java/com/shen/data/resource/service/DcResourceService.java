package com.shen.data.resource.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.shen.common.resource.DcResourceEntity;

/**
 * 描述：</b><br>
 * @author：shenjy
 * @version:1.0
 */
@Transactional
@Component
public interface DcResourceService{
	
	/**
     * 描述: 根据主键查询
	 * @param entity entity含有资源ID 
     * @return
     */
	public DcResourceEntity get(DcResourceEntity entity);
	
	public void update(DcResourceEntity entity);
}
