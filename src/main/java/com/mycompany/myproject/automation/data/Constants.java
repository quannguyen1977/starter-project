package com.mycompany.myproject.automation.data;

public final class Constants {

    private Constants() {
    }

    // Application Defaults
    public static final byte[] SECURITY_KEY = {0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79};
    public static final int MAX_WEB_SERVICE_RESPONSE_TIME = 3000;
    public static final String LOAD_TEST_RESULTS_DIRECTORY = "performance/";

    // URLs
    public static final String SEARCH_URL = "/#search";
    public static final String ADVANCED_SEARCH_URL = "/#advancedsearch";

    // IMAGE Elements
    public static final String LOGO_ANCHOR_IMAGE = "//img[@class='logo']";

    // ANCHOR Elements
    public static final String VARIABLE_BY_TEXT_ANCHOR = "//a[text()='%s']";
    public static final String HELP_ANCHOR = "//a[contains(@href, 'login/resetpassword')]";
    public static final String QUICK_STATS_ANCHOR = "QUICK STATS";

    // INPUT Elements
    public static final String USERNAME_INPUT = "//*[@id='username']";
    public static final String PASSWORD_INPUT = "//*[@id='password']";
    public static final String KEYWORD_INPUT = "KEYWORD";
    public static final String GROUP_ID_INPUT = "groupId";
    public static final String SEARCH_INPUT = "//input[@id='search']";
    public static final String CONTINUE_BUTTON = "//*[@id='login-submit']/span/span/span";
    public static final String STORY_SUMMARY = "//*[@id='summary']";

    // BUTTON Elements
    public static final String COORDINATE_SEARCH_BUTTON = "gavSearchButton";
    public static final String SUBMIT_BUTTON = "//*[@id='login-submit']/span/span/span";
    public static final String CREATE_STORY = "//*[@id='createGlobalItem']/span/span";
    public static final String CREATE_BUTTON = "//*[@id='create-issue-submit']";

    // DIV Elements
    public static final String STATISTICS_DIV = "statsText";
    public static final String DROP_MENU = "//*[@id='project-single-select']/span";
    public static final String DROP_PROJECT = "//*[@id='helpPanelContainer']/div[1]/div/div[1]/header/nav/div[3]/div[2]/div/button/span/span[1]";

    // STATIC Text
    public static final String NO_RECORDS_FOUND_TEXT = "No records found, try new search criteria.";
    public static final String QN_PROJECT = "//*[@id='project-field']";
    public static final String QN_PROJECT_DASH = "//*[@id='jira']/div[5]/div[2]/div/span/div/div/div[1]/span/a[1]/div";
    public static final String SELECT_DELETE = "//*[@id='helpPanelContainer']/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[1]/section/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div/button/span/span";
    public static final String DELETE_BUTTON = "//*[@id='uid75']/span[2]/span/span";

}
