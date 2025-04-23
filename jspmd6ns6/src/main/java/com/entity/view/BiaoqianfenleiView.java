package com.entity.view;

import com.entity.BiaoqianfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 标签分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
@TableName("biaoqianfenlei")
public class BiaoqianfenleiView  extends BiaoqianfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiaoqianfenleiView(){
	}
 
 	public BiaoqianfenleiView(BiaoqianfenleiEntity biaoqianfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, biaoqianfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
