package com.amdocs.org.test;


	
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.amdocs.genericLib.BaseClass;
import com.amdocs.genericLib.ExcelUtility;
import com.amdocs.genericLib.JavaUtils;
import com.amdocs.genericLib.WebDriverUtiles;
import com.amdocs.objectrepo.CreatingNewLead;
import com.amdocs.objectrepo.Home;
import com.amdocs.objectrepo.LeadInformation;
import com.amdocs.objectrepo.Leads;
import com.amdocs.objectrepo.OrganizationInfo;
	

	/**
	 * @author shabana
	 
	 *
	 */
	public class ConvertLeadToOpertunitiesBySelectingOnlyOpertunityChekboxsTest extends BaseClass {

		@Test
		
		public void convertleadtest() throws Throwable{
			
			JavaUtils javaUtils = new JavaUtils();
			//WebDriverUtiles webdriverUtils = new WebDriverUtiles();
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
			//WebDriverUtiles.waitforElementToBeClickable(driver,homePage.getLeadsLnk());
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
			creatingNewLead.getSaveButtonLead().click();
			
			
			//LeadInformation should be display
			LeadInformation leadInformation = new LeadInformation(driver);
			//webDriverUtiles.waitforElement(leadInformation.getLeadInformationText());
			boolean leadInfoPageVarification = leadInformation.getLeadInformationText().getText().contains("Lead Information");
			Assert.assertTrue(leadInfoPageVarification);
			
		    /** * 4.Goto "Action" and click on "Convert Lead" link.**/
			 
		   leadInformation.getConvertLeadLink().click();
		   //Convert Lead Page " popup should display
		   //webDriverUtiles.waitforElement(leadInformation.getConvertLeadPopPup());
		   boolean ConvertLeadPopPupVarification = leadInformation.getConvertLeadPopPup().isDisplayed();
		   Assert.assertTrue(ConvertLeadPopPupVarification);
			
		   /***5.Slelect only "Organisation" checkbok and fill all the mandatory fiels and click on "Save" **/
		   leadInformation.getOrganizationRadioButton().click();
		   
			/*
			 * WebDriverUtiles.waitforElementToBeClickable(driver,
			 * leadInformation.getOrganizationCheckBox());
			 * WebDriverUtiles.selectCheckbox(leadInformation.getOrganizationCheckBox());
			 * WebDriverUtiles.waitforElementToBeClickable(driver,
			 * leadInformation.getOpportunityRadioButton());
			 * //webDriverUtiles.waitforElementToBeClickable(driver,
			 * leadInformation.getOpportunityRadioButton());
			 * WebDriverUtiles.deSelectCheckbox(leadInformation.getOpportunityRadioButton())
			 * ;
			 * 
			 * WebDriverUtiles.deSelectCheckbox(leadInformation.getContactCheckBox());
			 * WebDriverUtiles.select(leadInformation.getIndustryDropDown(),"Apparel");
			 */
		
		   /**"Select either Organization or Contact to convert the lead" message should display***/
		   
		   
		   /**
		   *Final Varification
		   * 
		   * **/
	     
		  leadInformation.getSaveButtonOfConvertLeadData().click();
		  
		  OrganizationInfo organizationInformationnew = new OrganizationInfo(driver);
		  boolean finalVarification = organizationInformationnew.getOrganizationInformationText().getText().contains("Organization Information");
		  Assert.assertTrue(finalVarification);
			
		 }
		
		
		
	}



