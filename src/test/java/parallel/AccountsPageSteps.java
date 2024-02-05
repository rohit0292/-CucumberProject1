package parallel;

import java.util.List;
import java.util.Map;


import org.testng.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class AccountsPageSteps {
	public static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;
	
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
	
		 List<Map<String,String>> credList = credTable.asMaps();
		 String userName = credList.get(0).get("username");
		 String password = credList.get(0).get("password");
		 
		 DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
		 DriverFactory.getDriver().manage().window().maximize();
		 accountsPage  = loginPage.doLogin(userName, password);
		 
		 
		
	}

	@Given("user click on My account page")
	public void user_click_on_my_account_page() throws InterruptedException {
	
		
		accountsPage.selectvaluefromDropDown("My Account");
		Thread.sleep(5000);
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title = accountsPage.getAccountsPageTitle();
		System.out.println("Accounts Page title is: " + title);
	
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string3) {
	
		Assert.assertEquals(string3,title);
		
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable dataTable) {

		List<String> expAccount_SectionsList = dataTable.asList();
		System.out.println("Expected accounts section list: " + expAccount_SectionsList);
		List<String> actualAccountSectionsList = accountsPage.getAccountsSectionsList();
		
		System.out.println("Actual accounts section list: " + actualAccountSectionsList);

		Assert.assertTrue(expAccount_SectionsList.containsAll(actualAccountSectionsList));

	}

	@And("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
		
		int ActualSectionCount = accountsPage.getAccountsSectionCount();
		Assert.assertTrue(ActualSectionCount  == expectedSectionCount);
		
		

	}
	
	

}
