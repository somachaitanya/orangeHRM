package com.hyb_hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hyb_hrms.lib.*;

public class testcase100 {
	
	General gen = new General();
	@Test(groups="test")
	public void tc100() {
		DOMConfigurator.configure("log4j.xml");
		gen.openApp();
		gen.login_alert();
		gen.closeApp();
	}
}
