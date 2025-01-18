package LoginTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.LoginPageWithPageFactory;
import com.orangeHRM.Pages.LoginPageWithoutPageFactory;
import com.orangeHRM.base.TestBase;
import com.orangeHRM.base.WaitFor;

public class LoginTest extends TestBase {

	@Test
	public void verifyLoginPageTitle() {
		LoginPageWithPageFactory loginPagePF = new LoginPageWithPageFactory(driver);
	
		loginPagePF.verifyLoginPageTitle();
	}

	@Test
	public void verifyLoginSuccess() {
		LoginPageWithPageFactory loginPagePF = new LoginPageWithPageFactory(driver);

		loginPagePF.enterUsername();
		loginPagePF.enterPassword();
		loginPagePF.clickOnLogin();
		loginPagePF.verifyLogin();
	}

	@Test
	public void verifyLoginWithEmptyUsernameAndPassword(){
		
	}
	
	
	@Test
	public void verifyAppLogoUsingPOM() {
		LoginPageWithPageFactory loginPagePF = new LoginPageWithPageFactory(driver);
		loginPagePF.verifyAppLogo();
	}
	
	@Test
	public void verifyLoginPageAllLinksAreClickable(){
		WaitFor waitFor=new WaitFor();
		List<WebElement> LoginPageLinks=driver.findElements(By.tagName("a"));
	
		
		for(WebElement link:LoginPageLinks) {
			waitFor.elementToBeClickable(link);
			System.out.println(link.getAttribute("href"));
		}
		
	}
	
	
}
