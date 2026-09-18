

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
|**totalCents** | **Integer** |  |  [optional] |
|**couponCode** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PAID | &quot;PAID&quot; |
| SHIPPED | &quot;SHIPPED&quot; |
| DELIVERED | &quot;DELIVERED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REFUNDED | &quot;REFUNDED&quot; |



