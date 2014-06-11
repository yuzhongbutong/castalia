package com.castalia.apple.service.demo.blh.impl;

import org.springframework.stereotype.Service;

import com.castalia.apple.service.demo.blh.IDemoBlh;
import com.castalia.core.base.blh.BaseBlh;

@Service("demoBlh")
public class DemoBlhImpl extends BaseBlh implements IDemoBlh {

	@Override
	public String getDemo() {
		return "demo";
	}
}
