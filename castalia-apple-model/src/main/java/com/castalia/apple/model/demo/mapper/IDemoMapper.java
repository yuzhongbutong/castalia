package com.castalia.apple.model.demo.mapper;

import java.util.List;

import com.castalia.apple.model.demo.entry.DemoEO;

public interface IDemoMapper {

	public void insertDemoEO(DemoEO demoEO);
	
	public List<DemoEO> getDemoEO();
}
