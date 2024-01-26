package org.testing.api.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void testStart(Scenario scenario) {
        logger.info("*****************************************************************************************");
        logger.info("	Scenario: " + scenario.getName());
        logger.info("*****************************************************************************************");
        //RestAssured.baseURI = Constants.BASE_URL;
    }

    @After
    public void testCleanUp() {
        logger.info("*****************************************************************************************");
        logger.info("	Cleaning up the test case");
        logger.info("*****************************************************************************************");
    }
}
