package com.user.mngmnt.dto;

public class Response {

	private int statusCode;
	private String status;
	private String redirectUrl;

	public Response(int statusCode, String status, String redirectUrl) {
		this.statusCode = statusCode;
		this.status = status;
		this.redirectUrl = redirectUrl;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
