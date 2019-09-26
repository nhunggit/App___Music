package com.example.appmusic;

import android.content.Context;

import java.util.ArrayList;

public class baihat {
    private  String stt;
    private String tenhaihat;
    private int tuychon;

    public baihat(String stt, String tenhaihat, int tuychon) {
        this.stt = stt;
        this.tenhaihat = tenhaihat;
        this.tuychon = tuychon;
    }



    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getTenhaihat() {
        return tenhaihat;
    }

    public void setTenhaihat(String tenhaihat) {
        this.tenhaihat = tenhaihat;
    }

    public int getTuychon() {
        return tuychon;
    }

    public void setTuychon(int tuychon) {
        this.tuychon = tuychon;
    }
}
