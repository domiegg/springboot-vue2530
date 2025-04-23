package com.entity.view;

import com.entity.YonghushangchuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户上传
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
@TableName("yonghushangchuan")
public class YonghushangchuanView  extends YonghushangchuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghushangchuanView(){
	}
 
 	public YonghushangchuanView(YonghushangchuanEntity yonghushangchuanEntity){
 	try {
			BeanUtils.copyProperties(this, yonghushangchuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
