package com.castalia.apple.model.demo.dao;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoDao {

	public abstract boolean saveDemoByVelo(DemoEO demoEO);

	public abstract boolean updateDemoByVelo(DemoEO demoEO);

	public abstract List<String> searchUserNameByVelo();

	public abstract List<DemoEO> searchDemoByVelo(String userName);

	public abstract boolean saveDemoByFree(DemoEO demoEO);

	public abstract List<DemoEO> searchDemoByFree(String userName);

}