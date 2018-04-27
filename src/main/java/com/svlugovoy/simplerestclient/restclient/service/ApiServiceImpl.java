package com.svlugovoy.simplerestclient.restclient.service;

//import com.svlugovoy.simplerestclient.api.domain.User;
import com.svlugovoy.simplerestclient.api.domain.UserData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private final String api_url;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("limit", limit);

        log.info("Invoked getUsers with limit={}, endpoint {}", limit, uriBuilder.toUriString());
        UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
        log.info("Returned follow users {}", userData.getData().stream().map(User::getEmail).collect(Collectors.toList()));

        return userData.getData();
    }
}
