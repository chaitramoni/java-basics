package com.xworkz.project.repository;

import java.util.List;

import com.xworkz.project.entity.TechnologyEntity;

public interface SearchTechRepo {
	
	default List<TechnologyEntity> searchByTechName(String technologyName,String language,String version,String owner,String supportFrom,String supportTo,String licenseNo,String openSource,String osType,String userId){
		return null;
	}
	
	
	default TechnologyEntity getByUser(String userId) {
		return null;
	}

}
