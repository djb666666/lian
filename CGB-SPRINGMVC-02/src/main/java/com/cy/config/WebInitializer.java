package com.cy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//-->web.xml
public class WebInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer {

//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		super.onStartup(servletContext);
//	}//注册DispatcherServlet
	
	//Service,Repository
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses()");
		return null;
	}
	//View,Controller
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses()");
		return new Class[] {SpringWebConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings()");
		return new String[] {"/"};
	}

}
