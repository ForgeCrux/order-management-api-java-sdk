package com.probestack.sdk.api;

import com.probestack.sdk.ApiClient;
import com.probestack.sdk.BaseApi;

import com.probestack.sdk.model.CancelOrderRequest;
import com.probestack.sdk.model.CreateOrderRequest;
import com.probestack.sdk.model.InventoryLevel;
import com.probestack.sdk.model.Order;
import com.probestack.sdk.model.RefundOrderRequest;
import com.probestack.sdk.model.RefundResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-09-18T07:34:32.000683723Z[GMT]", comments = "Generator version: 7.9.0")public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel an order
     * Cancels an order that has not yet shipped.
     * <p><b>200</b> - Order cancelled
     * @param orderId Unique ID of the order to cancel (required)
     * @param cancelOrderRequest  (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order cancelOrder(String orderId, CancelOrderRequest cancelOrderRequest) throws RestClientException {
        return cancelOrderWithHttpInfo(orderId, cancelOrderRequest).getBody();
    }

    /**
     * Cancel an order
     * Cancels an order that has not yet shipped.
     * <p><b>200</b> - Order cancelled
     * @param orderId Unique ID of the order to cancel (required)
     * @param cancelOrderRequest  (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> cancelOrderWithHttpInfo(String orderId, CancelOrderRequest cancelOrderRequest) throws RestClientException {
        Object localVarPostBody = cancelOrderRequest;
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling cancelOrder");
        }
        
        // verify the required parameter 'cancelOrderRequest' is set
        if (cancelOrderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cancelOrderRequest' when calling cancelOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Order> localReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/orders/{orderId}/cancel", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new order
     * Places a new order for a customer with one or more line items and a shipping address.
     * <p><b>201</b> - Order created
     * @param createOrderRequest  (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order createOrder(CreateOrderRequest createOrderRequest) throws RestClientException {
        return createOrderWithHttpInfo(createOrderRequest).getBody();
    }

    /**
     * Create a new order
     * Places a new order for a customer with one or more line items and a shipping address.
     * <p><b>201</b> - Order created
     * @param createOrderRequest  (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> createOrderWithHttpInfo(CreateOrderRequest createOrderRequest) throws RestClientException {
        Object localVarPostBody = createOrderRequest;
        
        // verify the required parameter 'createOrderRequest' is set
        if (createOrderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createOrderRequest' when calling createOrder");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Order> localReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/orders", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an order by ID
     * Retrieves full order details including line items and totals.
     * <p><b>200</b> - Order found
     * <p><b>404</b> - Order not found
     * @param orderId Unique ID of the order (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order getOrderById(String orderId) throws RestClientException {
        return getOrderByIdWithHttpInfo(orderId).getBody();
    }

    /**
     * Get an order by ID
     * Retrieves full order details including line items and totals.
     * <p><b>200</b> - Order found
     * <p><b>404</b> - Order not found
     * @param orderId Unique ID of the order (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> getOrderByIdWithHttpInfo(String orderId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling getOrderById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Order> localReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/orders/{orderId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a product&#39;s current stock level
     * Returns the current available quantity for a product across all warehouses.
     * <p><b>200</b> - Inventory level
     * @param productId Unique ID of the product (required)
     * @return InventoryLevel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventoryLevel getProductInventory(String productId) throws RestClientException {
        return getProductInventoryWithHttpInfo(productId).getBody();
    }

    /**
     * Check a product&#39;s current stock level
     * Returns the current available quantity for a product across all warehouses.
     * <p><b>200</b> - Inventory level
     * @param productId Unique ID of the product (required)
     * @return ResponseEntity&lt;InventoryLevel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InventoryLevel> getProductInventoryWithHttpInfo(String productId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getProductInventory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("productId", productId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<InventoryLevel> localReturnType = new ParameterizedTypeReference<InventoryLevel>() {};
        return apiClient.invokeAPI("/products/{productId}/inventory", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List orders
     * Returns orders, optionally filtered by status or customer.
     * <p><b>200</b> - Matching orders
     * @param status Filter by order status (optional)
     * @param customerId Filter by customer ID (optional)
     * @param limit Maximum number of orders to return (optional, default to 25)
     * @return List&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Order> listOrders(String status, String customerId, Integer limit) throws RestClientException {
        return listOrdersWithHttpInfo(status, customerId, limit).getBody();
    }

    /**
     * List orders
     * Returns orders, optionally filtered by status or customer.
     * <p><b>200</b> - Matching orders
     * @param status Filter by order status (optional)
     * @param customerId Filter by customer ID (optional)
     * @param limit Maximum number of orders to return (optional, default to 25)
     * @return ResponseEntity&lt;List&lt;Order&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Order>> listOrdersWithHttpInfo(String status, String customerId, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "customerId", customerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Order>> localReturnType = new ParameterizedTypeReference<List<Order>>() {};
        return apiClient.invokeAPI("/orders", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refund an order (fully or partially)
     * Issues a refund for all or part of a paid order&#39;s total.
     * <p><b>200</b> - Refund issued
     * @param orderId Unique ID of the order to refund (required)
     * @param refundOrderRequest  (required)
     * @return RefundResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RefundResult refundOrder(String orderId, RefundOrderRequest refundOrderRequest) throws RestClientException {
        return refundOrderWithHttpInfo(orderId, refundOrderRequest).getBody();
    }

    /**
     * Refund an order (fully or partially)
     * Issues a refund for all or part of a paid order&#39;s total.
     * <p><b>200</b> - Refund issued
     * @param orderId Unique ID of the order to refund (required)
     * @param refundOrderRequest  (required)
     * @return ResponseEntity&lt;RefundResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RefundResult> refundOrderWithHttpInfo(String orderId, RefundOrderRequest refundOrderRequest) throws RestClientException {
        Object localVarPostBody = refundOrderRequest;
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling refundOrder");
        }
        
        // verify the required parameter 'refundOrderRequest' is set
        if (refundOrderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refundOrderRequest' when calling refundOrder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RefundResult> localReturnType = new ParameterizedTypeReference<RefundResult>() {};
        return apiClient.invokeAPI("/orders/{orderId}/refund", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
