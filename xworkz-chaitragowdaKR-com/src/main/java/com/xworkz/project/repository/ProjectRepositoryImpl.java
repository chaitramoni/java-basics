package com.xworkz.project.repository;

import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologyEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepositoryImpl implements ProjectRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ProjectRepositoryImpl() {

		log.info("running project RepositoryImpl");
	}

	@Override
	public boolean save(ProjectEntity entity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}

	@Override
	public Long findCountByEmailAndUserIdAndMobile(String email, String userId, long mobile) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();

		Query query = manager.createNamedQuery("findByCount");
		query.setParameter("e", email);
		query.setParameter("d", userId);
		query.setParameter("p", mobile);
		Object object = query.getSingleResult();
		Long count = (Long) object;
		System.err.println(count);

		return count;

	}

	@Override
	public Long findByEmail(String email) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("emailId");
			query.setParameter("emailBy", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}

	}

	@Override
	public Long findByUser(String user) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("userId");
			query.setParameter("userBy", user);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}
	}

	@Override
	public Long findByMobile(Long number) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("mobileId");
			query.setParameter("mobileBy", number);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			em.close();
		}
	}

	@Override
	public ProjectEntity userSignIn(String userId) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("userANDpassword");
			query.setParameter("ui", userId);
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			log.info("" + entity);
			return entity;
		} finally {
			em.close();
		}

	}

	@Override
	public boolean onlock(String userId, int count) {
		EntityManager em = this.entityManagerFactory.createEntityManager();

		try {
			EntityTransaction et = em.getTransaction();
			et.begin();

			Query query = em.createNamedQuery("lockCount");
			query.setParameter("d", userId);
			query.setParameter("c", count);
			query.executeUpdate();
			et.commit();
			return true;
		} finally {
			em.close();

		}
	}

	@Override
	public ProjectEntity resetPassword(String email) {
		log.info("email  " + email);
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			Query query = em.createNamedQuery("email");
			query.setParameter("ei", email);
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			log.info("" + entity);
			return entity;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean update(ProjectEntity entity) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(entity);
			et.commit();
			return true;
		} finally {
			em.close();
		}
	}

	@Override
	public boolean updatePassword(String userId, String password, Boolean resetPassword,
			LocalTime passwordChangedTime) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = manager.getTransaction();
			et.begin();
			Query query = manager.createNamedQuery("updatePassword");
			query.setParameter("uu", userId);
			query.setParameter("up", password);
			query.setParameter("urp", resetPassword);
			query.setParameter("pct", passwordChangedTime);
			query.executeUpdate();
			et.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean saveTechnology(TechnologyEntity entity) {
		log.info("Running save in saveTechnology");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			return true;
		} finally {

			em.close();
		}
	}

}
