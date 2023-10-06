package com.xworkz.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.entity.PersonalInfo;
import com.xworkz.helper.ExcelToDatabase;
import com.xworkz.repository.PersonalInfoRepo;

@Service
public class ExcelService {
	
	@Autowired
	private PersonalInfoRepo repo;
	
	public void save(MultipartFile multi)throws IOException{
		
		List<PersonalInfo> personal = ExcelToDatabase.excelToDatabase(multi.getInputStream());
		repo.saveAll(personal);
		
	} 
	
	public List<PersonalInfo>getAllPersonalInfo(){
		return repo.findAll();
	}
	
	

}
