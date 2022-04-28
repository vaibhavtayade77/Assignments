package com.yashproject.model;

public class City {
	
	int sid;
	int cityid;
	String cityname;
	public City() {
		super();
		
	}
	public City(int sid, int cityid, String cityname) {
		super();
		this.sid = sid;
		this.cityid = cityid;
		this.cityname = cityname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	

}
