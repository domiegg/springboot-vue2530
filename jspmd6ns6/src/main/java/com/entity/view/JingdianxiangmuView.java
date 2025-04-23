package com.entity.view;

import com.entity.JingdianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
@TableName("jingdianxiangmu")
public class JingdianxiangmuView  extends JingdianxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingdianxiangmuView(){
	}
 
 	public JingdianxiangmuView(JingdianxiangmuEntity jingdianxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, jingdianxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
