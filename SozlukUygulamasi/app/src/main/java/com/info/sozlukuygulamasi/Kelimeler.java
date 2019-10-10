package com.info.sozlukuygulamasi;

import java.io.Serializable;

/**
 * Created by kasimadalan on 1.05.2018.
 */

public class Kelimeler implements Serializable {

    private String turkce;



    public Kelimeler(String turkce) {
        this.turkce = turkce;


    }

    public String getTurkce() {
        return turkce;
    }

    public void setTurkce(String turkce) {
        this.turkce = turkce;
    }


}
