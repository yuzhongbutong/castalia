package com.castalia.apple.service.demo.blh.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.castalia.apple.model.demo.dao.IDemoDao;
import com.castalia.apple.model.demo.entry.DemoEO;
import com.castalia.apple.service.demo.blh.IDemoBlh;
import com.castalia.core.base.blh.BaseBlh;

@Service("demoBlh")
public class DemoBlhImpl extends BaseBlh implements IDemoBlh {
	
	@Autowired
	@Qualifier("demoDao")
	private IDemoDao demoDao;

	@Override
	public boolean saveDemoJSP(DemoEO demoEO) {
		return demoDao.saveDemoEO(demoEO);
	}
	
	@Override
	public List<DemoEO> findDemoJSP() {
		return demoDao.findDemoEO();
	}
}
