package com.castalia.apple.service.demo.bsh.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.castalia.apple.model.demo.dao.IDemoDao;
import com.castalia.apple.model.demo.entry.DemoEO;
import com.castalia.apple.service.demo.blh.IDemoBlh;
import com.castalia.apple.service.demo.bsh.IDemoBsh;
import com.castalia.core.base.bsh.BaseBsh;

@Service("demoBsh")
public class DemoBshImpl extends BaseBsh implements IDemoBsh {
	
	@Autowired
	@Qualifier("demoBlh")
	private IDemoBlh demoBlh;
	
	@Autowired
	@Qualifier("demoDao")
	private IDemoDao demoDao;

	@Override
	public boolean saveDemoByVelo(DemoEO demoEO) {
		return demoDao.saveDemoByVelo(demoEO);
	}

	@Override
	public List<DemoEO> searchDemoByVelo(String userName) {
		return demoDao.searchDemoByVelo(userName);
	}

	@Override
	public boolean saveDemoByFM(DemoEO demoEO) {
		return demoBlh.saveDemoByFM(demoEO);
	}

	@Override
	public List<DemoEO> searchDemoByFM(String userName) {
		return demoBlh.searchDemoByFM(userName);
	}
}
