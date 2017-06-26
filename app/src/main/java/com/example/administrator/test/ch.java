package com.example.administrator.test;

import android.util.Log;

/**
 * Created by JasonWang on 2017/2/16 0016
 * Email：wangjiaxing920@163.com
 */
public class ch extends farther {
    public ch() {
        this("dd");
        Log.i("ch", "ch:子类无 ");
    }

    public ch(String ss) {
        super("dd");
        Log.i("ch", "ch:子类有 ");
    }
}
