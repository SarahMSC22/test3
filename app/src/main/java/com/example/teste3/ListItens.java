package com.example.teste3;

import java.io.Serializable;

class ListItens implements Serializable {
    private String text;
    private int imgId;

    public ListItens(String text, int imgId) {
        this.imgId = imgId;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
