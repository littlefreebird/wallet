package com.blzf.wallet.model;

import javax.validation.constraints.Email;

public class Mailbox {
    @Email(message = "email not valid")
    String mail_box;
    String verify_code;
}
