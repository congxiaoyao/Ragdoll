package com.congxiaoyao.ragdoll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.congxiaoyao.ragdolllib.TestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TestClass.toast(this, "hello world");
    }
}
