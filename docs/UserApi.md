# UserApi

All URIs are relative to *https://todolist.pctoplaal.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGet**](UserApi.md#userGet) | **GET** api/User/Get | 
[**userPost**](UserApi.md#userPost) | **POST** api/User/Post | 


<a name="userGet"></a>
# **userGet**
> Object userGet(email, password)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String email = "email_example"; // String | 
String password = "password_example"; // String | 
try {
    Object result = apiInstance.userGet(email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |
 **password** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="userPost"></a>
# **userPost**
> Object userPost(user)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    Object result = apiInstance.userPost(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

