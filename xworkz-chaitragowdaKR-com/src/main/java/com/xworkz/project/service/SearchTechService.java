package com.xworkz.project.service;

import java.util.List;

import com.xworkz.project.entity.TechnologyEntity;

public interface SearchTechService {

	default List<TechnologyEntity> searchByTechName(String technologyName, String language, String version,
			String owner, String supportFrom, String supportTo, String licenseNo, String openSource, String osType,
			String userId) {
		return null;
	}

}
