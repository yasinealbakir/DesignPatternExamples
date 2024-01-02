package FacadePattern.Facades;

import FacadePattern.Pages.CustomerAddPage;
import FacadePattern.Pages.HomePage;
import FacadePattern.Pages.LoginPage;
import FacadePattern.Pages.OpenAccountPage;
import FacadePattern.Pojos.User;

public class OpenDollarAccountFacade {
    private LoginPage loginPage;
    private HomePage homePage;
    private CustomerAddPage customerAddPage;
    private OpenAccountPage openAccountPage;

    public OpenDollarAccountFacade(LoginPage loginPage,
                                   HomePage homePage,
                                   CustomerAddPage customerAddPage,
                                   OpenAccountPage openAccountPage) {
        this.loginPage = loginPage;
        this.homePage = homePage;
        this.customerAddPage = customerAddPage;
        this.openAccountPage = openAccountPage;
    }

    public void openingDollarAccountForNewCustomer(User user) {
        loginPage.signIn();
        homePage.navigateCustomerAddPage();
        customerAddPage.createNewCustomerRecord(user.getName(), user.getLastName(), user.getPostCode());
        openAccountPage.openDollarAccount(customerAddPage.getCustomerId());
    }
}
