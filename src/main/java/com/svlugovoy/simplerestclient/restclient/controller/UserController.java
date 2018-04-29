package com.svlugovoy.simplerestclient.restclient.controller;

import com.svlugovoy.simplerestclient.restclient.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

@Controller
@Slf4j
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }

    @PostMapping(value = "/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange) {

        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
        String limitParam = map.get("limit").get(0);
        Integer limit = !limitParam.equals("") ? new Integer(limitParam) : 0;

        log.info("Received Limit value from controller: " + limit);
        //default if null or zero
        if (limit == null || limit == 0) {
            log.info("Setting limit to default of 10");
            limit = 10;
        }

        String action = map.get("action").get(0);
        if ("classic".equals(action)) {
            model.addAttribute("users", apiService.getUsers(limit));
        } else if ("reactive".equals(action)) {
            model.addAttribute("users", apiService.getUsers(limit));
//            model.addAttribute("users", apiService.getUsers(serverWebExchange.getFormData()
//                                            .map(data -> new Integer(data.getFirst("limit")))));
        } else {
            throw new RuntimeException("param: " + action + " is not supported.");
        }

        return "userslist";
    }


}
