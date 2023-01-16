package com.xworkz.constructorautowiredapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String snakeName;
	@Autowired
	@Qualifier("snakeLength")
	private int snakeLength;
	@Autowired
	@Qualifier("snakeColor")
	private String snakeColor;
	private String snakeType;
	
	
	public Snake(String snakeName, String snakeType) {
		
		this.snakeName = snakeName;
		this.snakeType = snakeType;
	}


	@Override
	public String toString() {
		return "Snake [snakeName=" + snakeName + ", snakeLength=" + snakeLength + ", snakeColor=" + snakeColor
				+ ", snakeType=" + snakeType + "]";
	}
	
	
	
	

}
