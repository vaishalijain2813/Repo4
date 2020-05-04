package steps;
import com.typesafe.config.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.KekaPage;
import utilities.ConfigLoader;

public class kekaPageSteps {
    KekaPage kekaPage;
    static Config config = ConfigLoader.load();

    @Given("^open the link$")
    public void openTheLink() {
        kekaPage.getDriver().manage().window().maximize();
        kekaPage.openUrl(config.getString("webdriver_base_url4"));
    }

    @Then("^click on Login with keka password$")
    public void clickOnLoginWithKekaPassword() {
        kekaPage.LoginWithKeka();
    }

    @Then("^Enter credentials in \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterCredentialsInAnd(String arg0, String arg1)
    {
        kekaPage.EnterCredentialsAndSignIn(arg0,arg1);
    }

    @Then("^verify left pane link and home components$")
    public void verifyLeftPaneLinkAndHomeComponents() {
        kekaPage.VerifyLeftPaneLinks();

    }

    @Given("^Click on Me and select Attendance\\.$")
    public void clickOnMeAndSelectAttendance() {
        kekaPage.ClickMeAndSelectAttendance();
    }

    @Then("^verify attendance data\\.$")
    public void verifyAttendanceData() {
        kekaPage.last30DaysData();
    }
}
