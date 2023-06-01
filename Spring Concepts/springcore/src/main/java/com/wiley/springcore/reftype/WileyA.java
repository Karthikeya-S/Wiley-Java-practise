package com.wiley.springcore.reftype;

public class WileyA {
	private int counta;
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private WileyB ob;
	private WileyAddress wadd;
	public WileyA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCounta() {
		return counta;
	}
	public WileyA(int counta, String address) {
		super();
		this.counta = counta;
		this.address = address;
	}
	public void setCounta(int counta) {
		this.counta = counta;
	}
	public WileyB getOb() {
		return ob;
	}
	public void setOb(WileyB ob) {
		this.ob = ob;
	}
	public WileyA(int counta, WileyB ob,WileyAddress wadd) {
		super();
		this.counta = counta;
		this.ob = ob;
		this.wadd = wadd;
	}
	public WileyAddress getWadd() {
		return wadd;
	}
	public void setWadd(WileyAddress wadd) {
		this.wadd = wadd;
	}
	@Override
	public String toString() {
		return "WileyA [counta=" + counta + ", ob=" + ob + ", wadd=" + wadd + "]";
	}
	
}
