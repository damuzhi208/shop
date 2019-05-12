package com.company.hxs.basedata.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * �߹�
 * @author luqi
 *
 */
@Entity
@Table(name = "t_base_linetube")
public class TBaseLineTube {
	
	/**
	 * ����
	 */
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	/**
	 * ���
	 */
	private String guige;
	
	/**
	 * ��λ
	 */
	private Integer danwei;
	
	/**
	 * ����
	 */
	private BigDecimal danjia;
	
	/**
	 * ���ͣ�1����2�߹�
	 */
	private Integer mType;

	@Transient
	private String danweiStr;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGuige() {
		return guige;
	}

	public void setGuige(String guige) {
		this.guige = guige;
	}

	public Integer getDanwei() {
		return danwei;
	}

	public void setDanwei(Integer danwei) {
		this.danwei = danwei;
	}

	public BigDecimal getDanjia() {
		return danjia;
	}

	public void setDanjia(BigDecimal danjia) {
		this.danjia = danjia;
	}

	public Integer getmType() {
		return mType;
	}

	public void setmType(Integer mType) {
		this.mType = mType;
	}

	public String getDanweiStr() {
		return danweiStr;
	}

	public void setDanweiStr(String danweiStr) {
		this.danweiStr = danweiStr;
	}
	
}