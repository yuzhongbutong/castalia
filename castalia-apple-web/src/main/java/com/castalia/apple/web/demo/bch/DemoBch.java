package com.castalia.apple.web.demo.bch;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		HttpSession session = request.getSession();
		model.addAttribute("sessionID", session.getId());
		return "demo/DemoSearchVM";
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
	
	@RequestMapping(value = "/jsp/save")
	public String saveDemoJSP() {
		DemoEO d = new DemoEO();
		d.setUserName("aa");
		d.setUpdateUser("UU");
		return "DemoJSP";
	}
	
	@RequestMapping(value = "/jsp/find")
	public String findDemoJSP() {
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
