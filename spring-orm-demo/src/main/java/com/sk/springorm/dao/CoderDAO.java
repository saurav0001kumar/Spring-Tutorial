package com.sk.springorm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sk.springorm.models.Coder;

//DAO = Data Access Object

@Component
public class CoderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Coder> getCoders() {
		Session session = sessionFactory.getCurrentSession();
		List<Coder> list = session.createQuery("from Coder", Coder.class).list();
		return list;
	}

	@Transactional
	public void addCodertoDB(Coder c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
	}

	@Transactional
	public Coder getOneCoder(int cid) {
		Session session = sessionFactory.getCurrentSession();
		Coder coder = session.get(Coder.class, cid);
		return coder;
	}
}
