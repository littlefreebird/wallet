package com.blzf.wallet.model;

public class Deposit {
    int time;
    double amount;
    int status;
    String protocol;
    String address;
    String hash;

    public void setTime(int time) {
        this.time = time;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public int getStatus() {
        return status;
    }

    public String getAddress() {
        return address;
    }

    public String getHash() {
        return hash;
    }

    public String getProtocol() {
        return protocol;
    }
}
