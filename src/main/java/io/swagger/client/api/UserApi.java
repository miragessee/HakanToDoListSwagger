package io.swagger.client.api;



import rx.Observable;
import io.reactivex.Completable;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.client.model.User;

public interface UserApi {
  /**
   * 
   * 
   * @param email  (required)
   * @param password  (required)
   * @return Call&lt;Object&gt;
   */
  @GET("api/User/Get")
  Call<Object> userGet(
    @retrofit2.http.Query("email") String email, @retrofit2.http.Query("password") String password
  );

  /**
   * 
   * 
   * @param user  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/User/Post")
  Call<Object> userPost(
    @retrofit2.http.Body User user
  );

}
