package com.example.iiday.javalog;

import android.util.Log;

/**
 * Created by iiday on 2017/12/02.
 */

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest", this.name+"("+this.age+"歳)"+"「ワンワン」");
    }
}
