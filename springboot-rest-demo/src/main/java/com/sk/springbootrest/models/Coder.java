package com.sk.springbootrest.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coder {

	@Id
	private int cid;
	private String cname;

	public Coder() {
	}

	public Coder(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

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
		return "cid=" + cid + ", cname=" + cname + "\n";
	}

}
