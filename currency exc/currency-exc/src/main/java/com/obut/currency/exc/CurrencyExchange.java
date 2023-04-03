package com.obut.currency.exc;

import java.math.BigDecimal;

public class CurrencyExchange {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionmultiple;
	//jpa ya bağlayacağı için jpa default contructor istiyor altta onu yapıyoruz
	public CurrencyExchange() {
		
	}
	
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionmultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionmultiple = conversionmultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}
	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}
	

}
