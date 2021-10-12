package com.grv.grvworkmanagertest;

import android.os.Build;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Test {

    String TAG = "grv";

    public void test() {
        ArrayList<String> list = new ArrayList<>();
        list.add("grv10101");
        list.add("")
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.e("GRV", "item " + list.get(0));
            }
        });
        t.start();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            list.forEach(s -> {
                Log.d(TAG, "test: " + s);
            });
            List<String> res= list.stream().filter(s -> s.startsWith("grv")).collect(Collectors.toList());
        }
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("Good");
        treeset.add("For");
        treeset.add("Health");
        //Add Duplicate Element
        treeset.add("Good");
        System.out.println("TreeSet : ");
        for (String temp : treeset) {
            System.out.println(temp);
        }
    }
}
