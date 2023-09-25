package com.sonali.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private long modelNo;
	private String modelName;
	private String ramsize;
	private String romsize;
	private String osName;
	private double price;
	public Mobile() {
		super();
	}
	public Mobile(long modelNo, String modelName, String ramsize, String romsize, String osName, double price) {
		super();
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.ramsize = ramsize;
		this.romsize = romsize;
		this.osName = osName;
		this.price = price;
	}
	public long getModelNo() {
		return modelNo;
	}
	public void setModelNo(long modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getRamsize() {
		return ramsize;
	}
	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}
	public String getRomsize() {
		return romsize;
	}
	public void setRomsize(String romsize) {
		this.romsize = romsize;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [modelNo=" + modelNo + ", modelName=" + modelName + ", ramsize=" + ramsize + ", romsize="
				+ romsize + ", osName=" + osName + ", price=" + price + "]";
	}
	
	
}
