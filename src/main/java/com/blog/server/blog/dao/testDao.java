package com.blog.server.blog.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.server.blog.entities.Authority;
import com.blog.server.blog.entities.User;

@Repository
@Transactional
public class testDao {

	@Autowired
	private EntityManager manager;

	public List<User> getUserData() {
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> user = cq.from(User.class);
		TypedQuery<User> query = manager.createQuery(cq);
		return query.getResultList();
	}

	public void saveUser(Authority user) {
		manager.persist(user);
	}

}
