package com.shen.common.resource;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * 描述：</b><br>
 * @author：shenjy
 * @version:1.0
 */
public class DcResourceEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *资源ID
	 */
	private BigInteger id;
	/**
	 *资源名称
	 */
	private String name;
	/**
	 *级别
	 */
	private Integer level;
	/**
	 *自带链接，可以没有
	 */
	private String pageUrl;
	/**
	 *父级ID
	 */
	private Integer parentId;
	/**
	 *1菜单资源；2页面元素资源
	 */
	private String type;
	/**
	 *排序
	 */
	private Integer sort;
	
	/**
	 * 是否启用：0-停用；1-启用
	 */
	private String isUse;
	
	private String selected;
	


	/**
	 *获取资源ID
	 */
	public BigInteger getId(){
		return this.id;
	}
	
	/**
	 *设置资源ID
	 */
	public void setId(BigInteger id){
		this.id = id;
	}
	
	/**
	 *获取资源名称
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 *设置资源名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *获取级别
	 */
	public Integer getLevel(){
		return this.level;
	}
	
	/**
	 *设置级别
	 */
	public void setLevel(Integer level){
		this.level = level;
	}
	
	/**
	 *获取自带链接，可以没有
	 */
	public String getPageUrl(){
		return this.pageUrl;
	}
	
	/**
	 *设置自带链接，可以没有
	 */
	public void setPageUrl(String pageUrl){
		this.pageUrl = pageUrl;
	}
	
	/**
	 *获取父级ID
	 */
	public Integer getParentId(){
		return this.parentId;
	}
	
	/**
	 *设置父级ID
	 */
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	
	/**
	 *获取1菜单资源；2页面元素资源
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 *设置1菜单资源；2页面元素资源
	 */
	public void setType(String type){
		this.type = type;
	}
	
	/**
	 *获取排序
	 */
	public Integer getSort(){
		return this.sort;
	}
	
	/**
	 *设置排序
	 */
	public void setSort(Integer sort){
		this.sort = sort;
	}
	
	


	

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}



	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}

	public String toString() {
		return "DcResourceEntity [id=" + id + ", name=" + name + ", level="
				+ level + ", pageUrl=" + pageUrl + ", parentId=" + parentId
				+ ", type=" + type + ", sort=" + sort + ", isUse=" + isUse
				+ ", selected=" + selected + "]";
	}
	
	/*user customize code start*/

	/*user customize code end*/
}

