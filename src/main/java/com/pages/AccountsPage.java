package com.pages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountsPage {
	
	 WebDriver ldriver;
	 
public AccountsPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	

@FindBy(xpath="//div[@aria-hidden='false']//ul[@class='header links']")
@CacheLookup
List<WebElement> welcomeList;
	
@FindBy(xpath="//ul[@class='nav items']//li")
@CacheLookup
 List<WebElement> accountSections;

public void selectvaluefromDropDown(String value){
	System.out.println(welcomeList.size());	
	for(int i = 0; i<welcomeList.size();i++) {
		System.out.println(welcomeList.get(i).getText());
		if (welcomeList.get(i).getText().equals(value)) {
			welcomeList.get(i).click();
			break;
}}}

public String getAccountsPageTitle() {
	return ldriver.getTitle();
}

public int getAccountsSectionCount() {
	
	int size = accountSections.size();
	return size;
}


public List<String> getAccountsSectionsList() {
	
	List<String> accountsList =  new ArrayList<>();
	for(WebElement e:accountSections) {
		
		String text = e.getText();
		System.out.println(text);
		accountsList.add(text);
}
	return accountsList;
	
}

}
