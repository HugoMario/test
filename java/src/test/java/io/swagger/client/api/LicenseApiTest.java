package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ActivationRequest;
import io.swagger.client.model.ActivationResponse;
import java.io.File;
import io.swagger.client.model.LicenseState;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LicenseApi
 */
public class LicenseApiTest {

    private final LicenseApi api = new LicenseApi();

    
    /**
     * 
     *
     * performs the license activation (online or offline)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateLicenseTest() throws ApiException {
        ActivationRequest offlineActivation = null;
        // ActivationResponse response = api.activateLicense(offlineActivation);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * provide the third activation code in case of an offline activation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activationCodeTest() throws ApiException {
        File offlineActivationFile = null;
        // api.activationCode(offlineActivationFile);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivationConfigurationTest() throws ApiException {
        // Object response = api.getActivationConfiguration();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * returns true if the server is licensed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isLicensedTest() throws ApiException {
        // LicenseState response = api.isLicensed();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * adds a license to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadLicenseTest() throws ApiException {
        File licenseFile = null;
        // LicenseState response = api.uploadLicense(licenseFile);

        // TODO: test validations
    }
    
}
