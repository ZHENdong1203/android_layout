package com.example.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

        ButtonListener1 listener1=new ButtonListener1();
        button1.setOnClickListener(listener1);
        ButtonListener2 listener2=new ButtonListener2();
        button2.setOnClickListener(listener2);
        ButtonListener3 listener3=new ButtonListener3();
        button3.setOnClickListener(listener3);
        ButtonListener4 listener4=new ButtonListener4();
        button4.setOnClickListener(listener4);



    }

    class ButtonListener1 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,Frame.class);
            startActivity(intent);
        }
    }

    class ButtonListener2 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent1=new Intent();
            intent1.setClass(MainActivity.this,Relative.class);
            startActivity(intent1);
        }
    }

    class ButtonListener3 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent2=new Intent();
            intent2.setClass(MainActivity.this,MyActivity.class);
            startActivity(intent2);
        }
    }


    class ButtonListener4 implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent3=new Intent();
            intent3.setClass(MainActivity.this,Table.class);
            startActivity(intent3);
        }
    }



}
