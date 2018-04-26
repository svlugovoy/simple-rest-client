package com.svlugovoy.simplerestclient.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {

    public String username;
    public String password;
    public String md5;
    public String sha1;
    public String sha256;
    private final static long serialVersionUID = -5567612741022338999L;

}
