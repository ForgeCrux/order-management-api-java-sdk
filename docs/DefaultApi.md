# DefaultApi

All URIs are relative to *https://api.orders.example.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOrder**](DefaultApi.md#cancelOrder) | **POST** /orders/{orderId}/cancel | Cancel an order |
| [**createOrder**](DefaultApi.md#createOrder) | **POST** /orders | Create a new order |
| [**getOrderById**](DefaultApi.md#getOrderById) | **GET** /orders/{orderId} | Get an order by ID |
| [**getProductInventory**](DefaultApi.md#getProductInventory) | **GET** /products/{productId}/inventory | Check a product&#39;s current stock level |
| [**listOrders**](DefaultApi.md#listOrders) | **GET** /orders | List orders |
| [**refundOrder**](DefaultApi.md#refundOrder) | **POST** /orders/{orderId}/refund | Refund an order (fully or partially) |



## cancelOrder

> Order cancelOrder(orderId, cancelOrderRequest)

Cancel an order

Cancels an order that has not yet shipped.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String orderId = "orderId_example"; // String | Unique ID of the order to cancel
        CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(); // CancelOrderRequest | 
        try {
            Order result = apiInstance.cancelOrder(orderId, cancelOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique ID of the order to cancel | |
| **cancelOrderRequest** | [**CancelOrderRequest**](CancelOrderRequest.md)|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order cancelled |  -  |


## createOrder

> Order createOrder(createOrderRequest)

Create a new order

Places a new order for a customer with one or more line items and a shipping address.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateOrderRequest createOrderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
        try {
            Order result = apiInstance.createOrder(createOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Order created |  -  |


## getOrderById

> Order getOrderById(orderId)

Get an order by ID

Retrieves full order details including line items and totals.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String orderId = "orderId_example"; // String | Unique ID of the order
        try {
            Order result = apiInstance.getOrderById(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getOrderById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique ID of the order | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order found |  -  |
| **404** | Order not found |  -  |


## getProductInventory

> InventoryLevel getProductInventory(productId)

Check a product&#39;s current stock level

Returns the current available quantity for a product across all warehouses.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String productId = "productId_example"; // String | Unique ID of the product
        try {
            InventoryLevel result = apiInstance.getProductInventory(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getProductInventory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **String**| Unique ID of the product | |

### Return type

[**InventoryLevel**](InventoryLevel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Inventory level |  -  |


## listOrders

> List&lt;Order&gt; listOrders(status, customerId, limit)

List orders

Returns orders, optionally filtered by status or customer.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String status = "PENDING"; // String | Filter by order status
        String customerId = "customerId_example"; // String | Filter by customer ID
        Integer limit = 25; // Integer | Maximum number of orders to return
        try {
            List<Order> result = apiInstance.listOrders(status, customerId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | **String**| Filter by order status | [optional] [enum: PENDING, PAID, SHIPPED, DELIVERED, CANCELLED, REFUNDED] |
| **customerId** | **String**| Filter by customer ID | [optional] |
| **limit** | **Integer**| Maximum number of orders to return | [optional] [default to 25] |

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching orders |  -  |


## refundOrder

> RefundResult refundOrder(orderId, refundOrderRequest)

Refund an order (fully or partially)

Issues a refund for all or part of a paid order&#39;s total.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.orders.example.com/v1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String orderId = "orderId_example"; // String | Unique ID of the order to refund
        RefundOrderRequest refundOrderRequest = new RefundOrderRequest(); // RefundOrderRequest | 
        try {
            RefundResult result = apiInstance.refundOrder(orderId, refundOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#refundOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Unique ID of the order to refund | |
| **refundOrderRequest** | [**RefundOrderRequest**](RefundOrderRequest.md)|  | |

### Return type

[**RefundResult**](RefundResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund issued |  -  |

