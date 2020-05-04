package pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class KekaPage extends PageObject {
    @FindBy(xpath = "//button[text()='Login with Keka Password']")
    WebElementFacade login;
    @FindBy(id = "email")
    WebElementFacade email1;
    @FindBy(id = "password")
    WebElementFacade password1;
    @FindBy(xpath = "//a[@href='/ui/#/me/leave']")
    WebElementFacade me;
    @FindBy(xpath = "//button[text()='Login']")
    WebElementFacade button;
    @FindBy(xpath = "//a[@href='#/me/attendance']")
    WebElementFacade attendance;
    @FindBy(xpath = "//span[text()='30 DAYS']")
    WebElementFacade last30Days;
    @FindBy(xpath = "//a[@href='#/inbox']")
    WebElementFacade inbox;
    @FindBy(xpath = "//a[@href='#/myteam/summary']")
    WebElementFacade myTeam;
    @FindBy(xpath = "//a[@href='/old/#/finances/summary']")
    WebElementFacade finance;
    @FindBy(xpath = "//a[@href='/old/#/todos']")
    WebElementFacade todo;
    @FindBy(xpath = "//a[@href='/ui/#/org/employees/directory']")
    WebElementFacade org;
    @FindBy(xpath = "//input[@typeaheadoptionfield='name']")
    WebElementFacade searchBar;
    @FindBy(xpath = "//span[@class='ic-move-down icon']")
    WebElementFacade iconMoveDown;
    @FindBy(xpath = "//div[home-attendance-clockin-widget]")
    WebElementFacade clockIn;
    @FindAll(
            {
                    @org.openqa.selenium.support.FindBy(xpath="//div[@class='w-250 mr-20']")
            }
    )
    List<WebElement> last30days = new ArrayList<>();
    public void switchToLatestTab() {
        Set<String> windows = getDriver().getWindowHandles();
        for (String ws : windows) {
            getDriver().switchTo().window(ws);
        }
    }

    public void LoginWithKeka() {
        login.withTimeoutOf(20, TimeUnit.SECONDS).click();
    }

    public void EnterCredentialsAndSignIn(String arg0, String arg1) {
        switchToLatestTab();
        email1.withTimeoutOf(10, TimeUnit.SECONDS).sendKeys(arg0);
        password1.withTimeoutOf(10, TimeUnit.SECONDS).sendKeys(arg1);
        button.withTimeoutOf(10, TimeUnit.SECONDS).click();
    }

    public void VerifyLeftPaneLinks() {
        if (me.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (inbox.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (myTeam.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (finance.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (todo.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (org.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (searchBar.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (iconMoveDown.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");

        if (clockIn.isDisplayed())
            System.out.println("Link is enable");
        else
            System.out.println("Element not found");
    }

    public void ClickMeAndSelectAttendance() {
        me.withTimeoutOf(10, TimeUnit.SECONDS).click();
        attendance.withTimeoutOf(10, TimeUnit.SECONDS).click();
        last30Days.withTimeoutOf(10, TimeUnit.SECONDS).click();
        waitABit(4000);

    }

   public void last30DaysData()
   {
       for(int i=0;i<30;i++)
       {
           System.out.println(last30days.get(i).getText());
       }
   }

}

