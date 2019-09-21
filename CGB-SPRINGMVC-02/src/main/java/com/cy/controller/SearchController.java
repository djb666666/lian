package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/search/")
public class SearchController {
	@RequestMapping("doSearch")
    @ResponseBody
	public String doSearch(String key) {
		return "cgb1904";
	}
}
