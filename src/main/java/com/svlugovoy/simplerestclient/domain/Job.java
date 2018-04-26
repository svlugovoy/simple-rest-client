package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    public String title;
    public String company;
    private final static long serialVersionUID = -3318532965967053763L;

}
