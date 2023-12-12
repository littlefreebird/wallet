package com.blzf.wallet.model;

import java.io.Serializable;

public class Bank implements Serializable {
    String account_name;
    String bank_name;
    String branch_name;
    String bank_number;

    public String getAccount_name() {
        return this.account_name;
    }
    public void setAccount_name(String name) {
        this.account_name = name;
    }
    public String getBank_name() {
        return this.bank_name;
    }
    public void setBank_name(String name) {
        this.bank_name = name;
    }
    public String getBranch_name() {
        return this.branch_name;
    }
    public void setBranch_name(String name) {
        this.branch_name = name;
    }
    public String getBank_number() {
        return this.bank_number;
    }
    public void setBank_number(String number) {
        this.bank_number = number;
    }
}
