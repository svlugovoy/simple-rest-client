package com.svlugovoy.simplerestclient.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
    private final static long serialVersionUID = 1869751797048719869L;

}
