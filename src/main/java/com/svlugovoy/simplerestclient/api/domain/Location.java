package com.svlugovoy.simplerestclient.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {

    private String street;
    private String city;
    private String state;
    private String postcode;
    private final static long serialVersionUID = 2259389648900634060L;

}
