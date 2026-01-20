package testscripts;

import org.testng.annotations.Test;

import Pages.AdminUsersPage;
import Pages.HomePage;
import Pages.LoginPage;

public class AdminUserTestScript extends BaseClassTestScript{
	HomePage home;
	AdminUsersPage adminuserpage;

	@Test
	public void verifyLoginandLogout() {
		LoginPage loginpageobj = new LoginPage(driver);
		
		loginpageobj.enterusernameandpassword("admin", "admin");
		home = loginpageobj.clickloginbutton();
		
		
//		HomePage homepageobj = new HomePage(driver);
//		homepageobj.verifythedashboard();
//		
//		AdminUsersPage adminuserpageobj = new AdminUsersPage(driver);
//		adminuserpageobj.addnewuserbyadmin();
//		
//		homepageobj.dashboardprofile();
//		homepageobj.clickLogoutButton();
		
		adminuserpage = home.clicknewuserbyadmin();
		adminuserpage.addnewuserbyadmin().savebuttonclick();
	}
}
