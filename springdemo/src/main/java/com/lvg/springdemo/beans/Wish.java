package com.lvg.springdemo.beans;


public class Wish
{
	private String message;
	public Wish() {}
	public Wish(String message)
	{
		this.message = message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		 return message;
	}
	
}
