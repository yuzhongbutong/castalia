package com.castalia.apple.service.demo.bsh.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.castalia.apple.service.demo.blh.IDemoBlh;
import com.castalia.apple.service.demo.bsh.IDemoBsh;
import com.castalia.core.base.bsh.BaseBsh;

@Service("demoBsh")
public class DemoBshImpl extends BaseBsh implements IDemoBsh {
	
	@Autowired
	@Qualifier("demoBlh")
	private IDemoBlh demoBlh;

	@Override
	public String getDemo() {
		return demoBlh.getDemo();
	}
}
