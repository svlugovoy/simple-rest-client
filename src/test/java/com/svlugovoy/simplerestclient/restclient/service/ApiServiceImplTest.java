package com.svlugovoy.simplerestclient.restclient.service;

import com.svlugovoy.simplerestclient.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void whenGetUsersWithLimitThenReturnCorrectQuantity() {

        List<User> users = apiService.getUsers(5);
        assertThat(users, hasSize(6)); //behavior of fake api
    }
}