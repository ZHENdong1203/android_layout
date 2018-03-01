package com.example.myapplication2;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        LayoutInflater inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout layoutLeft=(RelativeLayout)inflater.inflate(R.layout.left,null);
        RelativeLayout layoutRight=(RelativeLayout)inflater.inflate(R.layout.right,null);
        RelativeLayout.LayoutParams relParam=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        linearLayout.addView(layoutLeft,300,400);
        linearLayout.addView(layoutRight,relParam);
    }
}
