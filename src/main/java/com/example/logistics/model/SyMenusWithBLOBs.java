package com.example.logistics.model;

public class SyMenusWithBLOBs extends SyMenus {
    private byte[] text;

    private byte[] url;

    private byte[] tip;

    public byte[] getText() {
        return text;
    }

    public void setText(byte[] text) {
        this.text = text;
    }

    public byte[] getUrl() {
        return url;
    }

    public void setUrl(byte[] url) {
        this.url = url;
    }

    public byte[] getTip() {
        return tip;
    }

    public void setTip(byte[] tip) {
        this.tip = tip;
    }
}