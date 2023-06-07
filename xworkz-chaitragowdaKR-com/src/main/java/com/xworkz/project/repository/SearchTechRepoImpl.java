package com.xworkz.project.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.TechnologyEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class SearchTechRepoImpl implements SearchTechRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<TechnologyEntity> searchByTechName(String technologyName, String language, String version, String owner,
			String supportFrom, String supportTo, String licenseNo, String openSource, String osType, String userId) {
		log.info("Running in searchByTechName");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();

		try {

			Query query = entityManager.createNamedQuery("searchByTechName");
			query.setParameter("techName", technologyName);
			query.setParameter("lang", language);
			query.setParameter("ver", version);
			query.setParameter("ow", owner);
			query.setParameter("sf", supportFrom);
			query.setParameter("st", supportTo);
			query.setParameter("ln", licenseNo);
			query.setParameter("os", openSource);
			query.setParameter("ott", osType);
			query.setParameter("tuid", userId);

			List<TechnologyEntity> list = query.getResultList();
			log.info("See List in repo" + list);
			return list;

		} finally {
			entityManager.close();
		}

	}

}
