package com.amdocs.objectrepo;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	/**
	 * @author shabana
	 
	 */
	public class Leads {
		
		@FindBy(xpath="//img[@alt='Create Lead...']")
		private WebElement createLeadLink;
		
		public Leads(WebDriver driver){
		PageFactory.initElements(driver, this);	
		}
		
		
		public WebElement getCreateLeadLink(){
			
			return createLeadLink;
			
		}

	

}
