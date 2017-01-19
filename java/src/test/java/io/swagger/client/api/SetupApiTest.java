package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InstallationStatus;
import io.swagger.client.model.SystemRequirementsCheckResult;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SetupApi
 */
public class SetupApiTest {

    private final SetupApi api = new SetupApi();

    
    /**
     * 
     *
     * Verifies the system requirements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkSystemRequirementsTest() throws ApiException {
        // SystemRequirementsCheckResult response = api.checkSystemRequirements();

        // TODO: test validations
    }
    
    /**
     * Returns the overall status of mandatory installation steps
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstallationStateTest() throws ApiException {
        // InstallationStatus response = api.getInstallationState();

        // TODO: test validations
    }
    
}
