package com.grv.grvworkmanagertest;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Test test =new Test();
        test.test();
    }
}
