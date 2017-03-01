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

import io.swagger.client.model.Location;
import io.swagger.client.model.Service;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class LocationsApi {
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
  * Find Nearby Locations
  * This endpoint retrieves all locations that are near the specified location.
   * @param accept 
   * @param locationId 
   * @param radius Default in miles is 0.5, minimum is 0.1.
   * @param page The particular page of results. Default is 1.
   * @param perPage Amount of locations to return per page.
   * @return List<Location>
  */
  public List<Location> findNearbyLocations (String accept, String locationId, String radius, String page, String perPage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling findNearbyLocations",
      new ApiException(400, "Missing the required parameter 'accept' when calling findNearbyLocations"));
      }
  
      // verify the required parameter 'locationId' is set
      if (locationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling findNearbyLocations",
      new ApiException(400, "Missing the required parameter 'locationId' when calling findNearbyLocations"));
      }
  

  // create path and map variables
  String path = "/locations/{location_id}/nearby".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "radius", radius));
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
   * Find Nearby Locations
   * This endpoint retrieves all locations that are near the specified location.
   * @param accept    * @param locationId    * @param radius Default in miles is 0.5, minimum is 0.1.   * @param page The particular page of results. Default is 1.   * @param perPage Amount of locations to return per page.
  */
  public void findNearbyLocations (String accept, String locationId, String radius, String page, String perPage, final Response.Listener<List<Location>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling findNearbyLocations",
         new ApiException(400, "Missing the required parameter 'accept' when calling findNearbyLocations"));
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling findNearbyLocations",
         new ApiException(400, "Missing the required parameter 'locationId' when calling findNearbyLocations"));
    }
    

    // create path and map variables
    String path = "/locations/{location_id}/nearby".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "radius", radius));
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
  * Location
  * Retrieve all of the locations available in this database.
   * @param accept 
   * @param locationId 
   * @return List<Location>
  */
  public List<Location> retrieveLocation (String accept, String locationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocation",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocation"));
      }
  
      // verify the required parameter 'locationId' is set
      if (locationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling retrieveLocation",
      new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocation"));
      }
  

  // create path and map variables
  String path = "/locations/{location_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

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
   * Location
   * Retrieve all of the locations available in this database.
   * @param accept    * @param locationId 
  */
  public void retrieveLocation (String accept, String locationId, final Response.Listener<List<Location>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocation",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocation"));
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling retrieveLocation",
         new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocation"));
    }
    

    // create path and map variables
    String path = "/locations/{location_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

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
  * Services
  * Retrieve all services for this location
   * @param accept 
   * @param locationId 
   * @return List<Service>
  */
  public List<Service> retrieveLocationServices (String accept, String locationId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocationServices",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocationServices"));
      }
  
      // verify the required parameter 'locationId' is set
      if (locationId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling retrieveLocationServices",
      new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocationServices"));
      }
  

  // create path and map variables
  String path = "/locations/{location_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

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
           return (List<Service>) ApiInvoker.deserialize(localVarResponse, "array", Service.class);
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
   * Services
   * Retrieve all services for this location
   * @param accept    * @param locationId 
  */
  public void retrieveLocationServices (String accept, String locationId, final Response.Listener<List<Service>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocationServices",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocationServices"));
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'locationId' when calling retrieveLocationServices",
         new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveLocationServices"));
    }
    

    // create path and map variables
    String path = "/locations/{location_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(locationId.toString()));

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
              responseListener.onResponse((List<Service>) ApiInvoker.deserialize(localVarResponse,  "array", Service.class));
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
  * Locations
  * Retrieve all of the locations available.
   * @param accept 
   * @param page 
   * @param perPage 
   * @return List<Location>
  */
  public List<Location> retrieveLocations (String accept, String page, String perPage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'accept' is set
      if (accept == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocations",
      new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocations"));
      }
  

  // create path and map variables
  String path = "/locations".replaceAll("\\{format\\}","json");

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
   * Locations
   * Retrieve all of the locations available.
   * @param accept    * @param page    * @param perPage 
  */
  public void retrieveLocations (String accept, String page, String perPage, final Response.Listener<List<Location>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'accept' is set
    if (accept == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'accept' when calling retrieveLocations",
         new ApiException(400, "Missing the required parameter 'accept' when calling retrieveLocations"));
    }
    

    // create path and map variables
    String path = "/locations".replaceAll("\\{format\\}","json");

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
}
