package com.xworkz.constructorautowiredapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	private int newspaperId;
	private String newspaperName;
	private String newspaperOwnerName;
	@Autowired
	private String newspaperLanguage;
	private double newspaperPrice;

	public NewsPaper(String newspaperName, String newspaperOwnerName) {

		this.newspaperName = newspaperName;
		this.newspaperOwnerName = newspaperOwnerName;

	}

	
	 @Override
	public String toString() {
		return "NewsPaper [newspaperId=" + newspaperId + ", newspaperName=" + newspaperName + ", newspaperOwnerName="
				+ newspaperOwnerName + ", newspaperLanguage=" + newspaperLanguage + ", newspaperPrice=" + newspaperPrice
				+ "]";
	}


//	@Autowired
//public void setNewspaperPrice(double newspaperPrice) {
//		this.newspaperPrice = newspaperPrice;
//	}

}
