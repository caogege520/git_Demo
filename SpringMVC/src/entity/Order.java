package entity;

import java.sql.Date;

public class Order {
	//ID
	private int id;
	//订单编码
	private String ordCode;
	//商品名称
	private String ordductName;
	//供应商
	private int ordSuppiler;
	//订单金额
	private Double ordPrice;
	//是否付款
	private int ordPayment;
	//创建时间 
	private Date ordationDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdCode() {
		return ordCode;
	}
	public void setOrdCode(String ordCode) {
		this.ordCode = ordCode;
	}
	public String getOrdductName() {
		return ordductName;
	}
	public void setOrdductName(String ordductName) {
		this.ordductName = ordductName;
	}
	public int getOrdSuppiler() {
		return ordSuppiler;
	}
	public void setOrdSuppiler(int ordSuppiler) {
		this.ordSuppiler = ordSuppiler;
	}
	public Double getOrdPrice() {
		return ordPrice;
	}
	public void setOrdPrice(Double ordPrice) {
		this.ordPrice = ordPrice;
	}
	public int getOrdPayment() {
		return ordPayment;
	}
	public void setOrdPayment(int ordPayment) {
		this.ordPayment = ordPayment;
	}
	public Date getOrdationDate() {
		return ordationDate;
	}
	public void setOrdationDate(Date ordationDate) {
		this.ordationDate = ordationDate;
	}
}
