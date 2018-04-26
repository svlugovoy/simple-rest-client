package com.svlugovoy.simplerestclient.restclient.service;

import com.svlugovoy.simplerestclient.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
