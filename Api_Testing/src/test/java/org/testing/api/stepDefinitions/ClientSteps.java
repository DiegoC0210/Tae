package org.testing.api.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testing.api.requests.ClientRequest;

public class ClientSteps {
    private static final Logger        logger        = LogManager.getLogger(ClientSteps.class);
    private final        ClientRequest clientRequest = new ClientRequest();

    @Given("there are registered clients in the system")
    public void thereAreRegisteredClientsInTheSystem() {
        logger.info("This is the first step");
        clientRequest.getClients();
    }

    @When("This is a test")
    public void thisIsATest() {
    }
}
