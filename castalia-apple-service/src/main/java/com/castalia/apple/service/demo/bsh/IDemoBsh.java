package com.castalia.apple.service.demo.bsh;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoBsh {

	public abstract boolean saveDemoByVelo(DemoEO demoEO);

	public abstract List<DemoEO> searchDemoByVelo(String userName);

	public abstract boolean saveDemoByFM(DemoEO demoEO);

	public abstract List<DemoEO> searchDemoByFM(String userName);

}