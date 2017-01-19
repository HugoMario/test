package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
public class LogsApiTest {

    private final LogsApi api = new LogsApi();

    
    /**
     * Downloads logs files
     *
     * Download encrypted mongodb logging entries within date range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadLogsTest() throws ApiException {
        DateTime fromDate = null;
        DateTime toDate = null;
        // String response = api.downloadLogs(fromDate, toDate);

        // TODO: test validations
    }
    
}
