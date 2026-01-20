package testscripts;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageNewsPage;

public class ManagenewsPageTestScript extends BaseClassTestScript {
	@Test
	public void verifyManageNewsCreation() {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("admin", "admin");
		loginpageobj.clickloginbutton();
		HomePage homepageobj = new HomePage(driver);
		homepageobj.verifythedashboard();
		
		ManageNewsPage managemessagepageobj = new ManageNewsPage(driver);
		managemessagepageobj.addnewnewsbyadmin();
		managemessagepageobj.addnewmessagebyadmin();		
		managemessagepageobj.savemanagenews();
		
		homepageobj.dashboardprofile();
		homepageobj.clickLogoutButton();

	}
}
