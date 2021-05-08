package com.amdocs.objectrepo;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;



	/**
	 * @author shabana
	 */
	public class CreatingNewLead {
		
		@FindBy(name="firstname")
		private WebElement firstNameField;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastNameField;
	  
		@FindBy(xpath="//input[@name='company']")
		private WebElement companyNameField;
		
		@FindBy(xpath="//input[@name='annualrevenue']")
	    private WebElement annualRevenueField;
		
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
		private WebElement saveButtonLead;
		
		public CreatingNewLead(WebDriver driver){
		
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getFirstNameField(){
			
			return firstNameField;
		}
		
		public WebElement getLastNameField(){
			
			return lastNameField;
		}
		
		public WebElement getCompanyNameField(){
			
			return companyNameField;
		}
		public WebElement getSaveButtonLead(){
			
			return saveButtonLead;
			
		}
		
		public WebElement getAnnualRevenueField(){
			
			return annualRevenueField;
			
		}
		
		
	}



