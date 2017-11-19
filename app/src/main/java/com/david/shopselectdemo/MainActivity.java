package com.david.shopselectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final ArrayList<String> mVals= new ArrayList<String> ();

    static {
        mVals.add("麦当劳");
        mVals.add("KFC");
        mVals.add("必胜客-工厂店");
        mVals.add("一果一茶");
        mVals.add("庆丰包子");
        mVals.add("煎饼果子");
        mVals.add("MM");
        mVals.add("papajohn");
        mVals.add("麦当劳-汽车餐厅");
        mVals.add("KFC");
        mVals.add("必胜客");
        mVals.add("一果一茶");
        mVals.add("庆丰包子");
        mVals.add("煎饼果子");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TagFlowLayout flowLayout = (TagFlowLayout) findViewById(R.id.flow_layout);
        flowLayout.setAdapter(new TagAdapter<String>(mVals) {
            @Override
            public View getView(FlowLayout parent, int position, String s) {
                Button tv = new Button(getApplicationContext());
                tv.setText(s);
                return tv;
            }
        });
    }
}
