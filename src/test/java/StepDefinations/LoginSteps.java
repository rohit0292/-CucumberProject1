package StepDefinations;



import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("Users navigate website")
	public void users_navigate_website() {
		
		DriverFactory.getDriver().get("https://magento.softwaretestingboard.com/");
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().navigate().refresh();
	
	}

	@When("Click on Sign in link")
	public void click_on_sign_in_link() {
		
		loginPage.returntosignin();
		
	}

	@Then("Enter username {string} and password {string}")
	public void enter_username_and_password(String string1, String string2) {
		loginPage.UserName(string1);
		loginPage.Password(string2);

	}

	@Then("Click on Sign-in button for login page")
	public void click_on_sign_in_button_for_login_page() {
	   
		loginPage.clickSubmit();
	}

	@Then("User Click on welcome list with logout link for successfull logout")
	public void user_click_on_welcome_list_with_logout_link_for_successfull_logout() {
		loginPage.welcomeMenu();
		loginPage.clickLogout();

	}


	
	
	
	
}
