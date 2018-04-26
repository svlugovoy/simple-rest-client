package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExpirationDate implements Serializable {

    public String date;
    public Integer timezoneType;
    public String timezone;
    private final static long serialVersionUID = -3472482538750915616L;

}
