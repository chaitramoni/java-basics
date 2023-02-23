package com.xworkz.plane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.plane.entity.PlaneEntity;

@Repository
public class PlaneRepositoryImpl implements PlaneRepository{
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
public PlaneRepositoryImpl() {
		
		System.out.println("running Plane RepositoryImpl");
	}
	

	@Override
	public boolean save(PlaneEntity entity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
		
	}
	
	
	@Override
	public PlaneEntity findById(int id) {
		System.out.println("find by id in repo.." + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		PlaneEntity fromDB = entityManager.find(PlaneEntity.class,id);
		entityManager.close();
		return fromDB;
		
	}

}
