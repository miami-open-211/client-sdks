/**
 * Miami Open 211 API
 * This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


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

import io.swagger.client.model.Organization;
import io.swagger.client.model.Location;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizationsApi {
    private ApiClient apiClient;

    public OrganizationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganizationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for retrieveLOrganization */
    private com.squareup.okhttp.Call retrieveLOrganizationCall(String accept, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling retrieveLOrganization(Async)");
        }
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling retrieveLOrganization(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organization_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Organizations
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param organizationId  (required)
     * @return List&lt;Organization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Organization> retrieveLOrganization(String accept, String organizationId) throws ApiException {
        ApiResponse<List<Organization>> resp = retrieveLOrganizationWithHttpInfo(accept, organizationId);
        return resp.getData();
    }

    /**
     * Organizations
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param organizationId  (required)
     * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Organization>> retrieveLOrganizationWithHttpInfo(String accept, String organizationId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveLOrganizationCall(accept, organizationId, null, null);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Organizations (asynchronously)
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param organizationId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveLOrganizationAsync(String accept, String organizationId, final ApiCallback<List<Organization>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveLOrganizationCall(accept, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for retrieveLOrganizationLocations */
    private com.squareup.okhttp.Call retrieveLOrganizationLocationsCall(String accept, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling retrieveLOrganizationLocations(Async)");
        }
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling retrieveLOrganizationLocations(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organization_id}/locations".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organization_id" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Organization Locations
     * This endpoint retrieves all locations that belong to a particular organization.
     * @param accept  (required)
     * @param organizationId  (required)
     * @return List&lt;Location&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Location> retrieveLOrganizationLocations(String accept, String organizationId) throws ApiException {
        ApiResponse<List<Location>> resp = retrieveLOrganizationLocationsWithHttpInfo(accept, organizationId);
        return resp.getData();
    }

    /**
     * Organization Locations
     * This endpoint retrieves all locations that belong to a particular organization.
     * @param accept  (required)
     * @param organizationId  (required)
     * @return ApiResponse&lt;List&lt;Location&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Location>> retrieveLOrganizationLocationsWithHttpInfo(String accept, String organizationId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveLOrganizationLocationsCall(accept, organizationId, null, null);
        Type localVarReturnType = new TypeToken<List<Location>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Organization Locations (asynchronously)
     * This endpoint retrieves all locations that belong to a particular organization.
     * @param accept  (required)
     * @param organizationId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveLOrganizationLocationsAsync(String accept, String organizationId, final ApiCallback<List<Location>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveLOrganizationLocationsCall(accept, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Location>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for retrieveLOrganizations */
    private com.squareup.okhttp.Call retrieveLOrganizationsCall(String accept, String page, String perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accept' is set
        if (accept == null) {
            throw new ApiException("Missing the required parameter 'accept' when calling retrieveLOrganizations(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Organizations
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param page  (optional)
     * @param perPage  (optional)
     * @return List&lt;Organization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Organization> retrieveLOrganizations(String accept, String page, String perPage) throws ApiException {
        ApiResponse<List<Organization>> resp = retrieveLOrganizationsWithHttpInfo(accept, page, perPage);
        return resp.getData();
    }

    /**
     * Organizations
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param page  (optional)
     * @param perPage  (optional)
     * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Organization>> retrieveLOrganizationsWithHttpInfo(String accept, String page, String perPage) throws ApiException {
        com.squareup.okhttp.Call call = retrieveLOrganizationsCall(accept, page, perPage, null, null);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Organizations (asynchronously)
     * Retrieve all of the organizations available in this database.
     * @param accept  (required)
     * @param page  (optional)
     * @param perPage  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveLOrganizationsAsync(String accept, String page, String perPage, final ApiCallback<List<Organization>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveLOrganizationsCall(accept, page, perPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}