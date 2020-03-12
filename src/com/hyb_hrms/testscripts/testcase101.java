package com.hyb_hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hyb_hrms.lib.General;

public class testcase101 {
	
	@Test(groups="test")
	public void tc101() throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		gen.openApp();
		gen.login();
		gen.title();
		gen.admin_loc();
		gen.logout();
		
	}

}
