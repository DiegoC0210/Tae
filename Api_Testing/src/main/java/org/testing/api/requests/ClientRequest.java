package org.testing.api.requests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientRequest extends BaseRequest {
    private static final Logger logger = LogManager.getLogger(ClientRequest.class);

    public void getClients() {
        logger.info("This is the first call to the API");
    }
}
