package com.example.user.clickk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
    }

    public void clkcl(View view) {
        if((x%7==0)&&(x%10==7)){
            btn.setText("boom");
            x++;
        }
        else{
            btn.setText("this is click bumbeer"+x);
            x++;
        }
    }
}
