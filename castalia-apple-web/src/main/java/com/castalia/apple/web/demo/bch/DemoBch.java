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
	
	@RequestMapping(value = "/vm/insert")
	public String insertDemoVM() {
		DemoEO demoEO = new DemoEO();
		demoEO.setUserName("Jerry Joe");
		demoEO.setPassword("");
		demoEO.setUpdateUser("updateUser");
		demoBsh.InsertDemoVM(demoEO);
		return "demo/DemoSaveVM";
	}
	
	@RequestMapping(value = "/vm/get")
	public String getDemoVM() {
		demoBsh.getDemoVM();
		return "demo/DemoSaveVM";
	}
	
	@RequestMapping(value = "/jsp/save")
	public String saveDemoJSP() {
		DemoEO d = new DemoEO();
		d.setUserName("aa");
		d.setUpdateUser("UU");
		demoBsh.saveDemoJSP(d);
		return "DemoJSP";
	}
	
	@RequestMapping(value = "/jsp/find")
	public String findDemoJSP() {
		demoBsh.findDemoJSP();
		return "demo/DemoSaveJSP";
	}
	
	@RequestMapping(value = "/ftl")
	public String getDemoFTL() {
		return "DemoFTL";
	}
}
