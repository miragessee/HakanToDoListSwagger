package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserApi.class);
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void userGetTest() {
        String email = null;
        String password = null;
        // Object response = api.userGet(email, password);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     */
    @Test
    public void userPostTest() {
        User user = null;
        // Object response = api.userPost(user);

        // TODO: test validations
    }
}
