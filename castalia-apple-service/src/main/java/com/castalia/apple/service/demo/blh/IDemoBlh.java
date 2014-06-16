package com.castalia.apple.service.demo.blh;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoBlh {

	public abstract boolean saveDemoJSP(DemoEO demoEO);

	public abstract List<DemoEO> findDemoJSP();

}