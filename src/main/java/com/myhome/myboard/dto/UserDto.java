package com.myhome.myboard.dto;

public class UserDto {

	private String userid;
	private String username;
	private String userpwd;
	private String useremail;
	private String address;
	private String joindate;

	public String getUserId() {
		return userid;
	}

	public void setUserId(String userId) {
		this.userid = userId;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getUserPwd() {
		return userpwd;
	}

	public void setUserPwd(String userPwd) {
		this.userpwd = userPwd;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

}
