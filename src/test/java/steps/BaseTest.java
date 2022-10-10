package steps;

import com.talentlms.UI.helpersMethods.Helper;
import com.talentlms.UI.pagesObject.AdminHomePage;
import com.talentlms.UI.pagesObject.LoginPage;

public abstract class BaseTest {

   protected LoginPage loginPage = new LoginPage();
   protected Helper helper = new Helper();
   protected AdminHomePage adminHomePage = new AdminHomePage();
}
