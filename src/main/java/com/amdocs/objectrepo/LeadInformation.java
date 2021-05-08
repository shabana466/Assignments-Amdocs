package com.amdocs.objectrepo;


	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	/**
	 * @author shabana
	 */
	public class LeadInformation {
		
		@FindBy(className="dvHeaderText")
		private WebElement leadInformationText;
		
		@FindBy(xpath="//a[text()='Convert Lead']")
		private WebElement convertLeadLink;
		
		@FindBy(xpath="//div[@id='orgLay']")
		private WebElement convertLeadPopPup; 
		
		@FindBy(xpath="//input[@id='select_account']")
		private WebElement organizationCheckBox;
		
		
		@FindBy(xpath="//input[@id='select_potential']")
		private WebElement opportunityRadioButton;
		
		@FindBy(xpath="//input[@id='select_contact']")
		private WebElement contactRedioButton;
		
		
		@FindBy(xpath="//td/select[@name='industry']")
		private WebElement industryDropDown;
		
		@FindBy(xpath="//input[contains(@onclick ,'verifyConvertLeadData(ConvertLead)')]")
		private WebElement saveButtonOfConvertLeadData;
		
		
		@FindBy(xpath="//input[@id='transfertoacc']")
		private WebElement organizationRadioButton;
		
		@FindBy(xpath="//input[@id='transfertocon']")
		private WebElement contactRadioButton;
		
		@FindBy(xpath="//input[@name='closingdate']")
		private WebElement expectedCloseDateField;
		
		@FindBy(name="LastNamefd")
		private WebElement lastNameFieldInConvertLead;
		
		@FindBy(css="input[id='potentialname']")
		private WebElement opportunityName;
		
		@FindBy(xpath="//td[@class='dvtCellInfo']/input[@name='lastname']")
		private WebElement lastNameCintact;
		
		
		
		
	    public LeadInformation(WebDriver driver){
		
	    	PageFactory.initElements(driver, this);
		}
	    
	    
	    public WebElement getLeadInformationText(){
			
	    	return leadInformationText;
	    }
	    
	    public WebElement getConvertLeadLink(){
			
	    	return convertLeadLink;
	    	
	    }
	    public WebElement getConvertLeadPopPup(){
			
	    	return convertLeadPopPup;
	    	
	    }
	    public WebElement getOrganizationCheckBox() {
			
	    	return convertLeadLink;
	    }
	    
	    public WebElement getOpportunityRadioButton(){
			
	    	return opportunityRadioButton;
	    }
	    public WebElement getContactCheckBox(){
			
	    	return contactRedioButton;
	    }
	    public WebElement getIndustryDropDown(){
			
	    	return industryDropDown;
	    }
	    
	    public WebElement getSaveButtonOfConvertLeadData() {
			return saveButtonOfConvertLeadData;
	    	
	    }
	    public WebElement getOrganizationRadioButton(){
			return organizationRadioButton;
	    }
	    public WebElement getContactRadioButton() {
			
	    	return contactRadioButton;
	    }
	    public WebElement getExpectedCloseDateField(){
			
	    	return expectedCloseDateField;
	    }
	    public WebElement getLastNameFieldInConvertLead(){
			
	    	return lastNameFieldInConvertLead;
	    }
	    
	    public WebElement getOpportunityNamepopup(){
			return opportunityName;
	    	
	    }
	   public WebElement getLastNameCintact(){
		return lastNameCintact;
	    	
	    }
	    
		
		
	


}
