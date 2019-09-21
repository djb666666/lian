package com.cy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //<context:component-scan base-package="com.cy.controller"/>
@RequestMapping("/search/") 
public class SearchController {//HandlerMapping-->map-->(key:url,value:HandlerMethod
	@RequestMapping("searchUI")
	public String searchUI() {
		return "search";//ModelAndView
	}///WEB-INF/pages/search.html
	
	@RequestMapping("doSearch")//url=/search/doSearch
	@ResponseBody //@ResponseBody将返回值以普通串的形式输出
	public String doSearch(String key){
	    return "cgb1904";	
	}
}
