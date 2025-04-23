package com.entity.vo;

import com.entity.JingdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 景点信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public class JingdianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点分类
	 */
	
	private String jingdianfenlei;
		
	/**
	 * 标签分类
	 */
	
	private String biaoqianfenlei;
		
	/**
	 * 景点地址
	 */
	
	private String jingdiandizhi;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 门票类型
	 */
	
	private String menpiaoleixing;
		
	/**
	 * 景点电话
	 */
	
	private String jingdiandianhua;
		
	/**
	 * 景点攻略
	 */
	
	private String jingdiangonglve;
		
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：景点分类
	 */
	 
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
				
	
	/**
	 * 设置：标签分类
	 */
	 
	public void setBiaoqianfenlei(String biaoqianfenlei) {
		this.biaoqianfenlei = biaoqianfenlei;
	}
	
	/**
	 * 获取：标签分类
	 */
	public String getBiaoqianfenlei() {
		return biaoqianfenlei;
	}
				
	
	/**
	 * 设置：景点地址
	 */
	 
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：门票类型
	 */
	 
	public void setMenpiaoleixing(String menpiaoleixing) {
		this.menpiaoleixing = menpiaoleixing;
	}
	
	/**
	 * 获取：门票类型
	 */
	public String getMenpiaoleixing() {
		return menpiaoleixing;
	}
				
	
	/**
	 * 设置：景点电话
	 */
	 
	public void setJingdiandianhua(String jingdiandianhua) {
		this.jingdiandianhua = jingdiandianhua;
	}
	
	/**
	 * 获取：景点电话
	 */
	public String getJingdiandianhua() {
		return jingdiandianhua;
	}
				
	
	/**
	 * 设置：景点攻略
	 */
	 
	public void setJingdiangonglve(String jingdiangonglve) {
		this.jingdiangonglve = jingdiangonglve;
	}
	
	/**
	 * 获取：景点攻略
	 */
	public String getJingdiangonglve() {
		return jingdiangonglve;
	}
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
