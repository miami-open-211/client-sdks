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

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Organization;
import io.swagger.client.model.Location;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrganizationsApi {
  String basePath = "https://miamiopen211-api.herokuapp.com/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Organizations
  * Retrieve all of the organizations available in this database.
   * @param accept 
   * @param organizationId 
   * @return List<Organization>
  */
  public List<Organization> retrieveLOrganization (String accept, String organizationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganization",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganization"));
      }
  
      // verify the required parameter 'organizationId' is set
      if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling retrieveLOrganization",
      new ApiException(400, "Missing the required parameter 'organizationId' when calling retrieveLOrganization"));
      }
  

  // create path and map variables
  String path = "/organizations/{organization_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organization_id" + "\\}", apiInvoker.escapeString(organizationId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Organization>) ApiInvoker.deserialize(localVarResponse, "array", Organization.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Organizations
   * Retrieve all of the organizations available in this database.
   * @param accept    * @param organizationId 
  */
  public void retrieveLOrganization (String accept, String organizationId, final Response.Listener<List<Organization>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganization",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganization"));
    }
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling retrieveLOrganization",
         new ApiException(400, "Missing the required parameter 'organizationId' when calling retrieveLOrganization"));
    }
    

    // create path and map variables
    String path = "/organizations/{organization_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organization_id" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Organization>) ApiInvoker.deserialize(localVarResponse,  "array", Organization.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Organization Locations
  * This endpoint retrieves all locations that belong to a particular organization.
   * @param accept 
   * @param organizationId 
   * @return List<Location>
  */
  public List<Location> retrieveLOrganizationLocations (String accept, String organizationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganizationLocations",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganizationLocations"));
      }
  
      // verify the required parameter 'organizationId' is set
      if (organizationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling retrieveLOrganizationLocations",
      new ApiException(400, "Missing the required parameter 'organizationId' when calling retrieveLOrganizationLocations"));
      }
  

  // create path and map variables
  String path = "/organizations/{organization_id}/locations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organization_id" + "\\}", apiInvoker.escapeString(organizationId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Location>) ApiInvoker.deserialize(localVarResponse, "array", Location.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Organization Locations
   * This endpoint retrieves all locations that belong to a particular organization.
   * @param accept    * @param organizationId 
  */
  public void retrieveLOrganizationLocations (String accept, String organizationId, final Response.Listener<List<Location>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganizationLocations",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganizationLocations"));
    }
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'organizationId' when calling retrieveLOrganizationLocations",
         new ApiException(400, "Missing the required parameter 'organizationId' when calling retrieveLOrganizationLocations"));
    }
    

    // create path and map variables
    String path = "/organizations/{organization_id}/locations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "organization_id" + "\\}", apiInvoker.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Location>) ApiInvoker.deserialize(localVarResponse,  "array", Location.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Organizations
  * Retrieve all of the organizations available in this database.
   * @param accept 
   * @param page 
   * @param perPage 
   * @return List<Organization>
  */
  public List<Organization> retrieveLOrganizations (String accept, String page, String perPage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganizations",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganizations"));
      }
  

  // create path and map variables
  String path = "/organizations".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "per_page", perPage));

          headerParams.put("Accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Organization>) ApiInvoker.deserialize(localVarResponse, "array", Organization.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Organizations
   * Retrieve all of the organizations available in this database.
   * @param accept    * @param page    * @param perPage 
  */
  public void retrieveLOrganizations (String accept, String page, String perPage, final Response.Listener<List<Organization>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLOrganizations",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLOrganizations"));
    }
    

    // create path and map variables
    String path = "/organizations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "per_page", perPage));

    headerParams.put("Accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Organization>) ApiInvoker.deserialize(localVarResponse,  "array", Organization.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
