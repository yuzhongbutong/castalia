package com.castalia.core.base.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class BaseDao {
	public Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<?> findEO(String eo) {
		List<?> list = hibernateTemplate.find(eo);
		return list;
	}
}
