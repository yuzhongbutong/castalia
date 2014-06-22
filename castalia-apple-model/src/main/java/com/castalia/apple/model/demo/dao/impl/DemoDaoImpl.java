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
	public boolean saveDemoByVelo(DemoEO demoEO) {
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
	public List<DemoEO> searchDemoByVelo(String userName) {
		List<DemoEO> demoEOList = new ArrayList<DemoEO>();
		List<String> condition = new ArrayList<String>();
		StringBuffer hql = new StringBuffer("from com.castalia.apple.model.demo.entry.DemoEO where 1 = 1");
		if (userName != null && !"".equals(userName)) {
			hql.append(" and userName = ?");
			condition.add(userName);
		}
		demoEOList = (List<DemoEO>) hibernateTemplate.find(hql.toString(), condition.toArray());
		return demoEOList;
	}
	
	@Override
	public boolean saveDemoByFM(DemoEO demoEO) {
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
	public List<DemoEO> searchDemoByFM(String userName) {
		List<DemoEO> demoEOList = new ArrayList<DemoEO>();
		demoEOList = demoMapper.getDemoEO(userName);
		return demoEOList;
	}
}
