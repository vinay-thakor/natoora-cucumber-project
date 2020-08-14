package uk.co.natoora.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.natoora.utility.Utility;

public class HomePage extends Utility {

    private static final Logger Log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//li[@class='timezone-uk']//span[contains(text(),'Community')]")
    WebElement _communityTab;

    @FindBy(css = "div.page:nth-child(1) header.main-header:nth-child(2) ul.primary-nav.clearfix li.timezone-uk:nth-child(4) ul.secondary-nav:nth-child(2) li:nth-child(4) > a:nth-child(1)")
    WebElement _eventsLink;

    @FindBy(linkText = "Events")
    WebElement _eventsText;

    public void clickOnCommunityTab(){
        waitUntilPresenceOfElementLocated(By.cssSelector("div.page:nth-child(1) header.main-header:nth-child(2) ul.primary-nav.clearfix li.timezone-uk:nth-child(4) ul.secondary-nav:nth-child(2) li:nth-child(4) > a:nth-child(1)"),20);
        Reporter.addStepLog("Clicking on Community button :" +_communityTab.toString());
        clickOnElement(_communityTab);
        Log.info("Clicking on Community button :" +_communityTab.toString());
    }


    public void clickOnEventsLink(){

        Reporter.addStepLog("Clicking on Events button :" +_eventsLink.toString());
        clickOnElement(_eventsLink);
        Log.info("Clicking on Events button :" +_eventsLink.toString());
    }

}
