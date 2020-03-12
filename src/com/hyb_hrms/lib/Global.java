package com.hyb_hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	public String url ="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un ="admin";
	public String pw="admin";
	public String title = "OrangeHRM";
	public String nameLoc ="hsbc";
	public String country ="United States";
	public String address="colombia";
	public String zipcode="500057";
	
	
	public String un_nam="txtUserName";
	public String pw_nam="txtPassword";
	public String lgn_xp="//input[@value='Login']";
	public String logut_lt = "Logout";
	public String admin_xp="//li[@id='admin']/a/span";
	public String compny_xp="//span[text()='Company Info']";
	public String loc_xp="//span[text()='Locations']";
	public String addLoc_xp="//input[@value='Add'][@class='plainbtn']";
	public String nameLoc_id="txtLocDescription";
	public String contry_id="cmbCountry";
	public String address_id="txtAddress";
	public String zipcode_nam="txtZIP";
	public String save_xp="//input[@value='Save']";
	public String pim_xp="//span[text()='PIM']";
	public String addemp_lt="Add Employee222";
	}

