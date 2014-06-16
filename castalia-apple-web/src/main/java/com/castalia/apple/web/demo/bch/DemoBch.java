package com.castalia.apple.web.demo.bch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castalia.apple.model.demo.entry.DemoEO;
import com.castalia.apple.service.demo.bsh.IDemoBsh;
import com.castalia.core.base.bch.BaseBch;

@Controller
@RequestMapping(value = "/demo")
public class DemoBch extends BaseBch {

	@Autowired
	@Qualifier("demoBsh")
	private IDemoBsh demoBsh;
	
	@RequestMapping(value = "/jsp/save")
	public String saveDemoJSP() {
		demoBsh.saveDemoJSP(new DemoEO());
		return "DemoJSP";
	}
	
	@RequestMapping(value = "/jsp/find")
	public String findDemoJSP() {
		System.out.println("////////////////");
		logger.error("ddddddddddddddddebug");
		demoBsh.findDemoJSP();
		return "DemoJSP";
	}
	
	@RequestMapping(value = "/vm/insert")
	public String insertDemoVM() {
		DemoEO demoEO = new DemoEO();
		demoEO.setId(10);
		demoEO.setUserName("Jerry Joe");
		demoEO.setPassword("");
		demoEO.setUpdateUser("updateUser");
		demoBsh.InsertDemoVM(demoEO);
		return "DemoVM";
	}
	
	@RequestMapping(value = "/vm/get")
	public String getDemoVM() {
		demoBsh.getDemoVM();
		return "DemoVM";
	}
	
	@RequestMapping(value = "/ftl")
	public String getDemoFTL() {
		return "DemoFTL";
	}
}
