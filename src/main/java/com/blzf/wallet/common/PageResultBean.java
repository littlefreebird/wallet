package com.blzf.wallet.common;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class PageResultBean<T> implements Serializable {
    private String msg = "";
    private int code;
    private int total;
    private List<T> data;

    public PageResultBean(int total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    public int getTotal() {
        return this.total;
    }

    public int getCode() {
        return this.code;
    }

   public String getMsg() {
        return this.msg;
    }

    public List<T> getData() {
        return this.data;
    }
}
