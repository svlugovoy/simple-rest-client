package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Location implements Serializable {

    public String street;
    public String city;
    public String state;
    public String postcode;
    private final static long serialVersionUID = 2259389648900634060L;

}
