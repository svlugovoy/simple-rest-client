package com.svlugovoy.simplerestclient.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExpirationDate implements Serializable {

    private String date;
    private Integer timezoneType;
    private String timezone;
    private final static long serialVersionUID = -3472482538750915616L;

}
