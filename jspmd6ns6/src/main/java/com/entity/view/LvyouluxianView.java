package com.entity.view;

import com.entity.LvyouluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游路线
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
@TableName("lvyouluxian")
public class LvyouluxianView  extends LvyouluxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyouluxianView(){
	}
 
 	public LvyouluxianView(LvyouluxianEntity lvyouluxianEntity){
 	try {
			BeanUtils.copyProperties(this, lvyouluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
