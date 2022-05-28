package com.libi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author libi
 * @date 2022-05-28 14:13:46
 */
@TableName("F27X9_133a")
public class F27x9133aDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 
	 */
	private Integer s1;
	/**
	 * 
	 */
	private Integer s2;
	/**
	 * 
	 */
	private Integer s3;
	/**
	 * 
	 */
	private Integer s4;
	/**
	 * 
	 */
	private Integer s5;
	/**
	 * 
	 */
	private Integer s6;
	/**
	 * 
	 */
	private Integer s7;
	/**
	 * 
	 */
	private Integer s8;
	/**
	 * 
	 */
	private Integer s9;
	/**
	 * 
	 */
	private Integer s10;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setS1(Integer s1) {
		this.s1 = s1;
	}
	/**
	 * 获取：
	 */
	public Integer getS1() {
		return s1;
	}
	/**
	 * 设置：
	 */
	public void setS2(Integer s2) {
		this.s2 = s2;
	}
	/**
	 * 获取：
	 */
	public Integer getS2() {
		return s2;
	}
	/**
	 * 设置：
	 */
	public void setS3(Integer s3) {
		this.s3 = s3;
	}
	/**
	 * 获取：
	 */
	public Integer getS3() {
		return s3;
	}
	/**
	 * 设置：
	 */
	public void setS4(Integer s4) {
		this.s4 = s4;
	}
	/**
	 * 获取：
	 */
	public Integer getS4() {
		return s4;
	}
	/**
	 * 设置：
	 */
	public void setS5(Integer s5) {
		this.s5 = s5;
	}
	/**
	 * 获取：
	 */
	public Integer getS5() {
		return s5;
	}
	/**
	 * 设置：
	 */
	public void setS6(Integer s6) {
		this.s6 = s6;
	}
	/**
	 * 获取：
	 */
	public Integer getS6() {
		return s6;
	}
	/**
	 * 设置：
	 */
	public void setS7(Integer s7) {
		this.s7 = s7;
	}
	/**
	 * 获取：
	 */
	public Integer getS7() {
		return s7;
	}
	/**
	 * 设置：
	 */
	public void setS8(Integer s8) {
		this.s8 = s8;
	}
	/**
	 * 获取：
	 */
	public Integer getS8() {
		return s8;
	}
	/**
	 * 设置：
	 */
	public void setS9(Integer s9) {
		this.s9 = s9;
	}
	/**
	 * 获取：
	 */
	public Integer getS9() {
		return s9;
	}
	/**
	 * 设置：
	 */
	public void setS10(Integer s10) {
		this.s10 = s10;
	}
	/**
	 * 获取：
	 */
	public Integer getS10() {
		return s10;
	}
}
