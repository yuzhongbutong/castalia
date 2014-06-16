package com.castalia.apple.model.demo.dao;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoDao {

	public abstract boolean saveDemoEO(DemoEO demoEO);

	public abstract List<DemoEO> findDemoEO();

	public abstract boolean insertDemoEO(DemoEO demoEO);

	public abstract List<DemoEO> getDemoEO();

}