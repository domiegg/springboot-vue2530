package com.entity.view;

import com.entity.DiscussjingdianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:54
 */
@TableName("discussjingdianxiangmu")
public class DiscussjingdianxiangmuView  extends DiscussjingdianxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingdianxiangmuView(){
	}
 
 	public DiscussjingdianxiangmuView(DiscussjingdianxiangmuEntity discussjingdianxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingdianxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
