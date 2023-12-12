package com.blzf.wallet.model;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class User {
    private String account;
    private String password;
    private boolean remember_pwd;
}
