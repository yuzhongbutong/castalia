package com.castalia.apple.web.demo.bch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castalia.apple.service.demo.bsh.IDemoBsh;
import com.castalia.core.base.bch.BaseBch;

@Controller
@RequestMapping(value = "/demo")
public class DemoBch extends BaseBch {

	@Autowired
	@Qualifier("demoBsh")
	private IDemoBsh demoBsh;
	
	@RequestMapping(value = "/jsp")
	public String getDemoJSP() {
		System.out.println(demoBsh.getDemo()+"11111111111111111111");
		return "DemoJSP";
	}
	
	@RequestMapping(value = "/vm")
	public String getDemoVM() {
		System.out.println(demoBsh.getDemo()+"11111111111111111111");
		return "DemoVM";
	}
	
	@RequestMapping(value = "/ftl")
	public String getDemoFTL() {
		System.out.println(demoBsh.getDemo()+"11111111111111111111");
		return "DemoFTL";
	}
}
