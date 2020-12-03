package com.mycompany.myproject.automation.tests.web;

import com.mycompany.myproject.automation.data.Constants;
import com.mycompany.myproject.automation.frameworksupport.Groups;
import com.mycompany.myproject.automation.frameworksupport.MyApplicationTestCase;
import com.pwc.core.framework.annotations.Issue;
import com.pwc.core.framework.annotations.MaxRetryCount;
import com.pwc.core.framework.annotations.TestCase;
import com.pwc.core.framework.listeners.Retry;
import org.testng.annotations.Test;

import static com.pwc.logging.service.LoggerService.FEATURE;
import static com.pwc.logging.service.LoggerService.GIVEN;
import static com.pwc.logging.service.LoggerService.SCENARIO;
import static com.pwc.logging.service.LoggerService.THEN;
import static com.pwc.logging.service.LoggerService.WHEN;

public class BasicTest extends MyApplicationTestCase {

    @Override
    public void beforeMethod() {
    }

    @Override
    public void afterMethod() {
    }

    @TestCase("Zephyr-123")
    @Issue("STORY-777")
    @MaxRetryCount(3)
    @Test(retryAnalyzer = Retry.class, groups = {Groups.ACCEPTANCE_TEST})
    public void testBasic() {

        FEATURE("Web-Based Feature Under Test");
        SCENARIO("Scenario Being Tested Here");

        GIVEN("log into jira");
        WHEN("enter username and password");
        String usernameValue = "ucsdperftest@gmail.com";
        String userPasswordValue = "ucsdperftest";


        webElementExists(Constants.USERNAME_INPUT);
        webAction(Constants.USERNAME_INPUT, usernameValue);
        THEN("submit");
        webAction(Constants.SUBMIT_BUTTON);
        webElementExists(Constants.PASSWORD_INPUT);
        webAction(Constants.PASSWORD_INPUT, userPasswordValue);
        webAction(Constants.SUBMIT_BUTTON);



        String userStorySummary = "Quan Test";
        GIVEN("click on create");
        WHEN("CREATING STORY");

        webElementExists(Constants.CREATE_STORY);
        webAction(Constants.CREATE_STORY);

        THEN("create story");
        webElementExists(Constants.STORY_SUMMARY);
        webAction(Constants.STORY_SUMMARY, userStorySummary);

        GIVEN("Pick my project");
        WHEN("Dropdown Menu appeared");
        webElementExists(Constants.DROP_MENU);

        THEN("pick my project");
        webAction(Constants.DROP_MENU);
        webAction(Constants.QN_PROJECT, "Quan Nguyen (QN)");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        //webAction(Constants.QN_PROJECT);
        //waitForElementToBecomeEnabled("Quan Nguyen");

        webElementExists(Constants.CREATE_STORY);
        webAction(Constants.CREATE_BUTTON);


        GIVEN("TRY TO DELETE PROJECT");
        WHEN("IN DASHBOARD");

        webElementExists(Constants.DROP_PROJECT);
        webAction(Constants.DROP_PROJECT);

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        webAction(Constants.QN_PROJECT_DASH, "Quan Nguyen (QN)");

        THEN("SELECT DELETE FROM DASH");
        webElementExists(Constants.SELECT_DELETE);
        webAction(Constants.SELECT_DELETE);
        webAction(Constants.DELETE_BUTTON);


    }

}
