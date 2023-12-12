package com.blzf.wallet.model;

public class WithdrawWalletDetail {
    String protocol;
    String address;
    int time;
    int status;
    double amount;

    public void setTime(int time) {
        this.time = time;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAddress() {
        return address;
    }

    public int getStatus() {
        return status;
    }

    public int getTime() {
        return time;
    }
}
