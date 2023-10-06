package com.xworkz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.entity.PersonalInfo;
import com.xworkz.helper.ExcelToDatabase;
import com.xworkz.message.PResponseMessage;
import com.xworkz.service.ExcelService;

@Controller
@RequestMapping("/data")
public class ExcelController {
	
	@Autowired
	ExcelService service;
	
	
	@PostMapping("/excel")
	public ResponseEntity<PResponseMessage> uploadFile(@RequestParam("file") MultipartFile multi){
		
		String message = "";
		
		if(ExcelToDatabase.forExcelFormat(multi)) {
			
			try {
				service.save(multi);
				
				message = "uploaded the file successfully:"+multi.getOriginalFilename();
				return ResponseEntity.status(HttpStatus.OK).body(new PResponseMessage(message));
				
				
			}catch(Exception e) {
				message = "could not upload the file:"+multi.getOriginalFilename();
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PResponseMessage(message));
				
			}
		}
		
		message = "please upload an excel file!";
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PResponseMessage(message));
	}
			
			
			@GetMapping("/database")
			public ResponseEntity<List<PersonalInfo>> getAllPersonalInfo(){
				
				try {
					List<PersonalInfo> personal = service.getAllPersonalInfo();
					
					if(personal.isEmpty()) {
						return new ResponseEntity<>(HttpStatus.NO_CONTENT);
					}
					return new ResponseEntity<>(personal,HttpStatus.OK);
					
				}catch(Exception e) {
					return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
				}
				
				
			}
			
		}
		
		
		
	
