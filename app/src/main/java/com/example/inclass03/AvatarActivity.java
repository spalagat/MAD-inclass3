package com.example.inclass03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static com.example.inclass03.MainActivity.VALUE_KEY;

public class AvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        findViewById(R.id.first_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             int  image_id = R.id.first_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                //intent.putExtra(Flag_KEY,1);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        findViewById(R.id.second_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  image_id = R.id.second_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        findViewById(R.id.third_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  image_id = R.id.third_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        findViewById(R.id.fourth_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  image_id = R.id.fourth_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        findViewById(R.id.fifth_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  image_id = R.id.fifth_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        findViewById(R.id.sixth_avatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  image_id = R.id.sixth_avatar;
                Intent intent=new Intent();
                intent.putExtra(VALUE_KEY,image_id);
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
}
