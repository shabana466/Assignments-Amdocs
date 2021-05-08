package com.amdocs.org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amdocs.genericLib.BaseClass;
import com.amdocs.genericLib.ExcelUtility;
import com.amdocs.genericLib.JavaUtils;
import com.amdocs.genericLib.WebDriverUtiles;
import com.amdocs.objectrepo.CreatingNewLead;
import com.amdocs.objectrepo.Home;
import com.amdocs.objectrepo.Leads;

public class CreatNewLeadByGivingInvalidInputToAnnualRevenueTest extends BaseClass{
	
	@Test
	public void creatNewLeadByGivingInvalidInputToAnnualRevenue() throws Throwable {
		
		JavaUtils javaUtils = new JavaUtils();
		ExcelUtility excelUtility = new ExcelUtility();
		/**Test Date**/
		String firstNameLead = excelUtility.getExcelData("Contact", "tc_24", "FirstName");
	    String lastNameLead = excelUtility.getExcelData("Contact", "tc_24", "LastName");
	 	String companyName = excelUtility.getExcelData("Contact", "tc_24", "CompanyName");
		/***Note:For rendom number***/
		int randomNumber = javaUtils.generateRandomNum();
		int oneNumberForAll=randomNumber;
	    
		/**
		 *3.Click on "Lead" and select a Lead from the list 
		 **/
		Home homePage = new Home(driver);
		//webDriverUtiles.waitforElementToBeClickable(driver,homePage.getLeadsLnk());
		homePage.getLeadsLnk().click();
		
		/**
		 * Note:Create lead (precondations)
		 * **/
		Leads leadsPage = new Leads(driver);
		//webDriverUtiles.waitforElementToBeClickable(driver, leadsPage.getCreateLeadLink());
		leadsPage.getCreateLeadLink().click();
		
		CreatingNewLead creatingNewLead = new CreatingNewLead(driver);
		//WebDriverUtiles.waitforElement(creatingNewLead.getCompanyNameField());
		creatingNewLead.getFirstNameField().sendKeys(firstNameLead+oneNumberForAll);
		creatingNewLead.getLastNameField().sendKeys(lastNameLead+oneNumberForAll);
		creatingNewLead.getCompanyNameField().sendKeys(companyName+oneNumberForAll);
		creatingNewLead.getAnnualRevenueField().sendKeys("!@-++");
		creatingNewLead.getSaveButtonLead().click(); 
		
		boolean invalidRavenueVarification = WebDriverUtiles.getTextFromAlert(driver).contains("Invalid Annual Revenue");
		Assert.assertTrue(invalidRavenueVarification);
		//WebDriverUtiles.alertOK(driver);
		
	}
	

}



