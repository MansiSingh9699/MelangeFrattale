package com.example.mansi.melangefrattale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ImgView;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgView = (ImageView)findViewById(R.id.like);
    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.like:{
                if(flag)
                {
                    ImgView.setImageResource(R.drawable.star);
                    flag=false;
                }
                else
                {
                    ImgView.setImageResource(R.drawable.liked);
                    flag=true;
                }
                return;
            }
        }
    }
}
