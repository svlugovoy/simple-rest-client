package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {

    public String type;
    public String number;
    public ExpirationDate expirationDate;
    public String iban;
    public String swift;
    private final static long serialVersionUID = 1869751797048719869L;

}
