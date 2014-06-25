package com.castalia.apple.web.demo.bch;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.castalia.apple.model.demo.entry.DemoEO;
import com.castalia.apple.service.demo.bsh.IDemoBsh;
import com.castalia.core.base.bch.BaseBch;

@Controller
@RequestMapping(value = "/demo")
public class DemoBch extends BaseBch {

	@Autowired
	@Qualifier("demoBsh")
	private IDemoBsh demoBsh;

	@RequestMapping(value = "/vm/init/save")
	public String initSaveByVelo() {
		return "demo/DemoSaveVM";
	}

	@RequestMapping(value = "/vm/init/search")
	public String initSearchByVelo(Model model, HttpServletRequest request) {
		return "demo/DemoSearchVM";
	}

	@ResponseBody
	@RequestMapping(value = "/vm/get/user")
	public List<String> getUserNameByAjax(Model model, HttpServletRequest request) {
		List<String> userNameList = demoBsh.searchUserNameByVelo();
		return userNameList;
	}
	
	@RequestMapping(value = "/vm/operate/save")
	public String saveDemoByVelo(Model model, @ModelAttribute("demoForm") DemoEO demoEO) {
		boolean flag = demoBsh.saveDemoByVelo(demoEO);
		model.addAttribute("flag", flag);
		return "demo/DemoSaveVM";
	}
	
	@RequestMapping(value = "/vm/operate/search")
	public String searchDemoByVelo(Model model, @RequestParam Map<String, Object> parameters) {
		List<DemoEO> demoEOList = demoBsh.searchDemoByVelo((String) parameters.get("userName_cdt"));
		model.addAttribute("userName", parameters.get("userName_cdt"));
		model.addAttribute("demoEOList", demoEOList);
		return "demo/DemoSearchVM";
	}
	
	@RequestMapping(value = "/ftl/init/save")
	public String initSaveByFree(Model model) {
		model.addAttribute("flag", null);
		return "demo/DemoSaveFTL";
	}
	
	@RequestMapping(value = "/ftl/init/search")
	public String initSearchByFree() {
		return "demo/DemoSaveJSP";
	}
	
	@RequestMapping(value = "/ftl")
	public String getDemoFTL() {
		//Ajax
		//Ajax
		//Ajax
		return "DemoFTL";
	}
}
