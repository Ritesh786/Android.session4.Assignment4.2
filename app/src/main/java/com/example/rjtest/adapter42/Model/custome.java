package com.example.rjtest.adapter42.Model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rjtest.adapter42.R;

public class custome  {


    private String name;
    private long phoneno;

    public custome() {
    }
    public custome(String name,long phoneno) {
        this.name = name;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
}
