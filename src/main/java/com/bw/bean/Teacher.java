package com.bw.bean;

public class Teacher {
	private Integer tid;
	private String tname;
	public Teacher(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}	
