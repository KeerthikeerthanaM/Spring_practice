package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                                                                //to connect spring and java class-component  & connect java and java-autowired
public class Home {
	private String owner;
	private int doorNo;


	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	@Autowired
	private InternetConnection modem;


	public void connect() {
		modem.switchOn();
		System.out.println("Connecting..................");
	}

}
