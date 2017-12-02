package com.example.iiday.javalog;

import android.util.Log;

/**
 * Created by iiday on 2017/12/02.
 */

public class BigDog extends Dog{

    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }

}
