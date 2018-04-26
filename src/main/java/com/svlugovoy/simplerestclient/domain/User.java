package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Login login;
    public String phone;
    public Job job;
    public Billing billing;
    public String language;
    public String currency;
    private final static long serialVersionUID = -9209767145324462506L;

}
