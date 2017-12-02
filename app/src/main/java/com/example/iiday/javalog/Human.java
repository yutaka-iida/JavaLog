package com.example.iiday.javalog;

import android.util.Log;

/**
 * Created by iiday on 2017/12/02.
 */

public class Human extends Animal implements Thinkable {
    static String to_jp="人間";

    String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public void say(){
        Log.d("javatest", "私の名前は"+name+"です。歳は"+age+"歳です。");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は"+hobby+"について考える");
    }
}
