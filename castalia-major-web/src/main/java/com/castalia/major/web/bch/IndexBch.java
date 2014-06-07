package com.castalia.major.web.bch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.castalia.major.core.base.bch.BaseBch;
import com.castalia.major.service.bsh.IndexBsh;

@Controller
@RequestMapping(value="/index")
public class IndexBch extends BaseBch {
	
	@Autowired
	private IndexBsh indexBsh;

	@RequestMapping(value="/login")
	public String getResult() {
		System.out.println("//////////////////"+indexBsh.getResult("aaaa"));
		return "jsp/index";
	}
}
