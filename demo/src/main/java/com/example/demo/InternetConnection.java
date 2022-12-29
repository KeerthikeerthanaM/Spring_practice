package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	private int ipAddress;
	private int speed;
	public int getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(int ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void switchOn()
	{
		System.out.println("Internet is switching on............!");
	}

}
