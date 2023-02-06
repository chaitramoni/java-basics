package com.xworkz.execption.things;

import com.xworkz.execption.bridge.EmailRepo;
import com.xworkz.execption.events.EmailSizeExceedException;
public class EmailRepoImpl implements EmailRepo{
	private String[] email=new String[10];
	private int emailIndex=0;

	@Override
	public boolean create(String email) {
		System.out.println("running method gmail reop");
		if(this.emailIndex<this.email.length) {
			throw new EmailSizeExceedException();
			
		}
		this.email[emailIndex]=email;
		this.emailIndex++;
		return false;
	}

}
