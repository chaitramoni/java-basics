package com.xworkz.execption.boot;

import com.xworkz.execption.bridge.EmailRepo;
import com.xworkz.execption.things.EmailRepoImpl;

public class EmailRunner {
 public static void main(String[] args) {
	EmailRepo emailRepo=new EmailRepoImpl() ;
	
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	emailRepo.create("chetansv21@gmail.com");
	
	
	
	System.out.println("email");
	
}

}
