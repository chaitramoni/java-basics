package com.xworkz.plane.repository;

import com.xworkz.plane.entity.PlaneEntity;

public interface PlaneRepository {
	
	boolean save(PlaneEntity entity);

	PlaneEntity findById(int id);

	

}
