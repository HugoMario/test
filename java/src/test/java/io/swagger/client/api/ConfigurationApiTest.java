package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ConfigurationResponse;
import io.swagger.client.model.ConfigurationState;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
public class ConfigurationApiTest {

    private final ConfigurationApi api = new ConfigurationApi();

    
    /**
     * 
     *
     * returns the configuration schema
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurationSchemaTest() throws ApiException {
        // Object response = api.getConfigurationSchema();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * returns the configuration values
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurationValuesTest() throws ApiException {
        // ConfigurationResponse response = api.getConfigurationValues();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * returns whether or not the system has an admin account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hasAdminAccountTest() throws ApiException {
        // ConfigurationState response = api.hasAdminAccount();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * returns whether or not the system is configured
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isConfiguredTest() throws ApiException {
        // ConfigurationState response = api.isConfigured();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * sets the configuration based on the &#x60;configuration definition&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setConfigurationTest() throws ApiException {
        Object configurationValues = null;
        // ConfigurationResponse response = api.setConfiguration(configurationValues);

        // TODO: test validations
    }
    
}
