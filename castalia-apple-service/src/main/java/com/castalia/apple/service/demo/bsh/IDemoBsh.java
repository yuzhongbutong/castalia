package com.castalia.apple.service.demo.bsh;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoBsh {

	public abstract boolean saveDemoJSP(DemoEO demoEO);

	public abstract List<DemoEO> findDemoJSP();

	public abstract boolean InsertDemoVM(DemoEO demoEO);

	public abstract List<DemoEO> getDemoVM();

}