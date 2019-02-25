package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.db.Submit_requirement;

@Repository
public class RequirementDao extends HibernateDaoSupport {

	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public Object insert(Submit_requirement submit_requirement) {
		return getHibernateTemplate().save(submit_requirement);
	}

	public Submit_requirement queryById(Integer id) {
		return getHibernateTemplate().get(Submit_requirement.class, id);
	}

	public List findByCriteria(DetachedCriteria criteria) {
		return getHibernateTemplate().findByCriteria(criteria);
	}

}
