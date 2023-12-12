package com.blzf.wallet.model;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class Register {
    @Size(min = 4, max = 12, message = "length should be in [4,12]")
    private String account;
    @Size(min = 6, max = 16, message = "length should be in [6,16]")
    private String password;
    private String verify_code;
}
