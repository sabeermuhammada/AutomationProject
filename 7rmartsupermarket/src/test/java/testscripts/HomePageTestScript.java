package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTestScript extends BaseClassTestScript {
	HomePage home;
	@Test
	public void verifyLoginandLogout() {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("admin", "admin");
		
//		loginpageobj.clickloginbutton();
//		System.out.println("Verify user name and password execute sucessfully completed");
//		HomePage homepageobj = new HomePage(driver);
		
//		homepageobj.verifythedashboard();
//		homepageobj.dashboardprofile();
//		homepageobj.clickLogoutButton();
		
		home = loginpageobj.clickloginbutton();
		home.verifythedashboard().dashboardprofile().clickLogoutButton();
		String DashboardTitle = "Login | 7rmart supermarket";
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, DashboardTitle,"Loginpage Failed");
	}
}
