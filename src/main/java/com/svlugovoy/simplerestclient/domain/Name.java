package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Name implements Serializable {

    public String title;
    public String first;
    public String last;
    private final static long serialVersionUID = -7895401606356814487L;

}
