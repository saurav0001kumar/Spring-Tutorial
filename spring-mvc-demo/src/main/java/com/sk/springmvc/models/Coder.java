package com.sk.springmvc.models;

public class Coder {
	private int cid;
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String toString() {
		return "cid=" + cid + ", cname=" + cname;
	}

}
