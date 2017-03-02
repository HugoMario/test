

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import java.io.File;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetApi {
    private ApiClient apiClient;

    public PetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addPet */
    private com.squareup.okhttp.Call addPetCall(Pet body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addPet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addPet(Pet body) throws ApiException {
        addPetWithHttpInfo(body);
    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addPetWithHttpInfo(Pet body) throws ApiException {
        com.squareup.okhttp.Call call = addPetCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add a new pet to the store (asynchronously)
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPetAsync(Pet body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addPetCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deletePet */
    private com.squareup.okhttp.Call deletePetCall(Long petId, String apiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling deletePet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null)
        localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePet(Long petId, String apiKey) throws ApiException {
        deletePetWithHttpInfo(petId, apiKey);
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePetWithHttpInfo(Long petId, String apiKey) throws ApiException {
        com.squareup.okhttp.Call call = deletePetCall(petId, apiKey, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a pet (asynchronously)
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePetAsync(Long petId, String apiKey, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePetCall(petId, apiKey, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for findPetsByStatus */
    private com.squareup.okhttp.Call findPetsByStatusCall(List<String> status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new ApiException("Missing the required parameter 'status' when calling findPetsByStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/findByStatus".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return List&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Pet> findPetsByStatus(List<String> status) throws ApiException {
        ApiResponse<List<Pet>> resp = findPetsByStatusWithHttpInfo(status);
        return resp.getData();
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Pet>> findPetsByStatusWithHttpInfo(List<String> status) throws ApiException {
        com.squareup.okhttp.Call call = findPetsByStatusCall(status, null, null);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds Pets by status (asynchronously)
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findPetsByStatusAsync(List<String> status, final ApiCallback<List<Pet>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findPetsByStatusCall(status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for findPetsByTags */
    private com.squareup.okhttp.Call findPetsByTagsCall(List<String> tags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tags' is set
        if (tags == null) {
            throw new ApiException("Missing the required parameter 'tags' when calling findPetsByTags(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/findByTags".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Finds Pets by tags
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return List&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Pet> findPetsByTags(List<String> tags) throws ApiException {
        ApiResponse<List<Pet>> resp = findPetsByTagsWithHttpInfo(tags);
        return resp.getData();
    }

    /**
     * Finds Pets by tags
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return ApiResponse&lt;List&lt;Pet&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Pet>> findPetsByTagsWithHttpInfo(List<String> tags) throws ApiException {
        com.squareup.okhttp.Call call = findPetsByTagsCall(tags, null, null);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds Pets by tags (asynchronously)
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findPetsByTagsAsync(List<String> tags, final ApiCallback<List<Pet>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findPetsByTagsCall(tags, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Pet>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPetById */
    private com.squareup.okhttp.Call getPetByIdCall(Long petId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling getPetById(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return Pet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Pet getPetById(Long petId) throws ApiException {
        ApiResponse<Pet> resp = getPetByIdWithHttpInfo(petId);
        return resp.getData();
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return ApiResponse&lt;Pet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pet> getPetByIdWithHttpInfo(Long petId) throws ApiException {
        com.squareup.okhttp.Call call = getPetByIdCall(petId, null, null);
        Type localVarReturnType = new TypeToken<Pet>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find pet by ID (asynchronously)
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPetByIdAsync(Long petId, final ApiCallback<Pet> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPetByIdCall(petId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Pet>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updatePet */
    private com.squareup.okhttp.Call updatePetCall(Pet body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updatePet(Pet body) throws ApiException {
        updatePetWithHttpInfo(body);
    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updatePetWithHttpInfo(Pet body) throws ApiException {
        com.squareup.okhttp.Call call = updatePetCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update an existing pet (asynchronously)
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePetAsync(Pet body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updatePetCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for updatePetWithForm */
    private com.squareup.okhttp.Call updatePetWithFormCall(Long petId, String name, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling updatePetWithForm(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/{petId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("name", name);
        if (status != null)
        localVarFormParams.put("status", status);

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updatePetWithForm(Long petId, String name, String status) throws ApiException {
        updatePetWithFormWithHttpInfo(petId, name, status);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws ApiException {
        com.squareup.okhttp.Call call = updatePetWithFormCall(petId, name, status, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a pet in the store with form data (asynchronously)
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePetWithFormAsync(Long petId, String name, String status, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updatePetWithFormCall(petId, name, status, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for uploadFile */
    private com.squareup.okhttp.Call uploadFileCall(Long petId, String additionalMetadata, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling uploadFile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/pet/{petId}/uploadImage".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (additionalMetadata != null)
        localVarFormParams.put("additionalMetadata", additionalMetadata);
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "petstore_auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata, File file) throws ApiException {
        ApiResponse<ModelApiResponse> resp = uploadFileWithHttpInfo(petId, additionalMetadata, file);
        return resp.getData();
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> uploadFileWithHttpInfo(Long petId, String additionalMetadata, File file) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileCall(petId, additionalMetadata, file, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * uploads an image (asynchronously)
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(Long petId, String additionalMetadata, File file, final ApiCallback<ModelApiResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadFileCall(petId, additionalMetadata, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
