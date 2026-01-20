package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserSearchPage;
import ultilies.ExcelUtility;

public class UserSearchPageTestScript extends BaseClassTestScript {
	@Test
	public void verifyadminsearchuserdetails() throws IOException {
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusernameandpassword("admin", "admin");
		loginpageobj.clickloginbutton();
		
		HomePage homepageobj = new HomePage(driver);		
		homepageobj.verifythedashboard();
		homepageobj.clicknewuserbyadmin();
		
//		AdminUsersPage adminuserpageobj = new AdminUsersPage(driver);
//		adminuserpageobj.addnewuserbyadmin();

		UserSearchPage usersearchpageobj = new UserSearchPage(driver);
		usersearchpageobj.headersearchbuttonclick();
		String username = ExcelUtility.getStringData(0, 0, "Userdetails");
		usersearchpageobj.enteruserdetails(username);
		usersearchpageobj.clicksearchbutton();
	}
}
