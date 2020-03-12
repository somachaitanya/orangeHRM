package com.hyb_hrms.testscripts;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hyb_hrms.lib.General;

public class Testcase102 {
	
	@Test(groups="test2")
	public void tc102() throws IOException {
		DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		gen.openApp();
		gen.login();
		gen.screenshot();
		gen.logout();
	}
}
