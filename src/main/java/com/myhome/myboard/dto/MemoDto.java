package com.myhome.myboard.dto;

public class MemoDto {
	private int memono;
	private String userid;
	private String comment;
	private String memotime;
	private int articleno;

	public int getMemono() {
		return memono;
	}

	public void setMemono(int memono) {
		this.memono = memono;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMemotime() {
		return memotime;
	}

	public void setMemotime(String memotime) {
		this.memotime = memotime;
	}

	public int getArticleno() {
		return articleno;
	}

	public void setArticleno(int articleno) {
		this.articleno = articleno;
	}
}