package com.castalia.apple.model.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.castalia.apple.model.demo.dao.IDemoDao;
import com.castalia.apple.model.demo.entry.DemoEO;
import com.castalia.apple.model.demo.mapper.IDemoMapper;
import com.castalia.core.base.dao.BaseDao;

@Repository("demoDao")
public class DemoDaoImpl extends BaseDao implements IDemoDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private IDemoMapper demoMapper;
	
	@Override
	public boolean saveDemoEO(DemoEO demoEO) {
		boolean flag = true;
		try {
			hibernateTemplate.save(demoEO);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DemoEO> findDemoEO() {
		List<DemoEO> demoEOList = new ArrayList<DemoEO>();
		demoEOList = (List<DemoEO>) hibernateTemplate.find("from com.castalia.apple.model.demo.entry.DemoEO");
		return demoEOList;
	}
	
	@Override
	public boolean insertDemoEO(DemoEO demoEO) {
		boolean flag = true;
		try {
			demoMapper.insertDemoEO(demoEO);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	@Override
	public List<DemoEO> getDemoEO() {
		List<DemoEO> demoEOList = new ArrayList<DemoEO>();
		demoEOList = demoMapper.getDemoEO();
		return demoEOList;
	}
}
