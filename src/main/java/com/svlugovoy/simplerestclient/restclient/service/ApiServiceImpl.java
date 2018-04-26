package com.svlugovoy.simplerestclient.restclient.service;

import com.svlugovoy.simplerestclient.api.domain.User;
import com.svlugovoy.simplerestclient.api.domain.UserData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

    public static final String URL = "http://apifaketory.com/api/user?limit=";

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        log.info("Invoked getUsers with limit={}", limit);
        UserData userData = restTemplate.getForObject(URL + limit, UserData.class);
        log.info("Returned follow users {}",
                userData.getData().stream().map(User::getEmail).collect(Collectors.toList()));

        return userData.getData();
    }
}
