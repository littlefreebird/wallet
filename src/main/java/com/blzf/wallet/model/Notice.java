package com.blzf.wallet.model;

public class Notice {
    String title;
    String content;
    int time;

    public int getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
