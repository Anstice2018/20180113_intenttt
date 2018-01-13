package com.example.student.a20180113_intenttt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = (TextView) findViewById(R.id.textView);
        Intent it = getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        tv.setText(str);
    }
}
