/**
 * 
 */
package com.qhit.sbm.account.bean;

import java.util.Date;

/**
 * @author admin
 * 2017年11月14日
 */
public class AccountDetail {
	private int accountId;
	private String goodsName;
	private int goodsNum;
	private float totalPrice;
	private int isPayed;
	private String providerName;
	private String goodsIntro;
	private Date accountDate;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getIsPayed() {
		return isPayed;
	}
	public void setIsPayed(int isPayed) {
		this.isPayed = isPayed;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	public AccountDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetail(int accountId, String goodsName, int goodsNum,
			float totalPrice, int isPayed, String providerName,
			String goodsIntro, Date accountDate) {
		super();
		this.accountId = accountId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.totalPrice = totalPrice;
		this.isPayed = isPayed;
		this.providerName = providerName;
		this.goodsIntro = goodsIntro;
		this.accountDate = accountDate;
	}
}
