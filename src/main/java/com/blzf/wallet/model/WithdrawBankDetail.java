package com.blzf.wallet.model;

public class WithdrawBankDetail {
    int time;
    String remark;
    double amount;
    String bank_name;
    String bank_account;
    int bank_id;

    public double getAmount() {
        return amount;
    }

    public int getTime() {
        return time;
    }

    public String getRemark() {
        return remark;
    }

    public int getBank_id() {
        return bank_id;
    }

    public String getBank_account() {
        return bank_account;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}

