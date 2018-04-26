package com.svlugovoy.simplerestclient.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    private String title;
    private String company;
    private final static long serialVersionUID = -3318532965967053763L;

}
