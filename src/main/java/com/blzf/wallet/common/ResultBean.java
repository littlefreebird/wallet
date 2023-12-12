package com.blzf.wallet.common;

import java.io.Serializable;

public class ResultBean implements Serializable {

    private String msg = "";
    private int code;
    private Object data;

    private ResultBean() {
        super();
    }

    private ResultBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultBean success(Object data) {
        return new ResultBean(0, "", data);
    }

    public static ResultBean success() {
        return new ResultBean(0, "", null);
    }

    public static ResultBean fail(int code, String msg) {
        return new ResultBean(code, msg, null);
    }

    public String getMsg() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

    public Object getData() {
        return this.data;
    }
}
