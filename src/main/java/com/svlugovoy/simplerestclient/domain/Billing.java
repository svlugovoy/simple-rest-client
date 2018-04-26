package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Billing implements Serializable {

    public Card card;
    private final static long serialVersionUID = -6705093193399190949L;

}
