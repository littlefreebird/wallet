package com.blzf.wallet.model;

public class ReceiveDetail {
    int peer_id;
    int time;
    String remark;
    double amount;

    public int getTime() {
        return time;
    }

    public int getPeer_id() {
        return peer_id;
    }

    public String getRemark() {
        return remark;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPeer_id(int peer_id) {
        this.peer_id = peer_id;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
