package com.example.inclass03;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int Request_code = 500;
    public static final String VALUE_KEY = "Image_ID";
    public static final String FName_key = "First Name";
    public static final String LName_KEY = "Last Name";
    public static final String SID_KEY = "Student ID";
    public static final String DPT_KEY = "Department ID";
    public static final String Image_KEY = "Profile Avatar";
    String Flag_KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.avatar_select).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AvatarActivity.class);
                startActivityForResult(intent,Request_code);

                //startActivity(intent);
            }
        });
        //final Integer dummy=getIntent().getExtras().getInt(Flag_KEY);
       findViewById(R.id.Save_button).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ImageView image=findViewById(R.id.avatar_select);
               EditText t1 = (EditText)findViewById(R.id.First_Name);
               EditText t2 = (EditText)findViewById(R.id.Last_Name);
               EditText t3 = (EditText)findViewById(R.id.Student_ID);
               RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);

               RadioButton r1 = (RadioButton)findViewById(R.id.CS_Dept);
               RadioButton r2 = (RadioButton)findViewById(R.id.SIS_dept);
               RadioButton r3 = (RadioButton)findViewById(R.id.BIO_dept);
               RadioButton r4 = (RadioButton)findViewById(R.id.Other_dept);


               //Integer img=image.getId();
               String f_name = t1.getText().toString();
               String l_name = t2.getText().toString();
               String S_Id = t3.getText().toString();
               String Department = "";
               String dept1 = r1.getText().toString();
               String dept2 = r2.getText().toString();
               String dept3 = r3.getText().toString();
               String dept4 = r4.getText().toString();

               if(t1.length() <= 0)
               {
                   t1.setError("Please enter First Name");
                   t1.requestFocus();
                   return;
               }
               if(t2.length() <= 0)
               {
                   t2.setError("Please enter Last Name");
                   t2.requestFocus();
                   return;
               }
               if(t3.length() <= 8)
               {
                     t3.setError("Please enter 9 digit number");
                     t3.requestFocus();
                     return;
               }
               if(rg.getCheckedRadioButtonId()==R.id.CS_Dept)
               {
                   Department=dept1;
               }else if (rg.getCheckedRadioButtonId()==R.id.SIS_dept)
               {
                   Department=dept2;
               }else if (rg.getCheckedRadioButtonId()==R.id.BIO_dept)
               {
                   Department=dept3;
               }else if (rg.getCheckedRadioButtonId()==R.id.Other_dept)
               {
                   Department=dept4;
               }else if (rg.getCheckedRadioButtonId()== -1)
               {
                   Toast.makeText(getBaseContext(),"Please select a department",Toast.LENGTH_LONG).show();;
                   return;
               }


               Log.d("demos","first name :"+f_name +" Last Name "+l_name+" Student ID "+S_Id);

               Intent intent=new Intent(MainActivity.this,DisplayProfile.class);
               intent.putExtra(Image_KEY,Flag_KEY);
               intent.putExtra(FName_key,f_name);
               intent.putExtra(LName_KEY,l_name);
               intent.putExtra(SID_KEY,S_Id);
               intent.putExtra(DPT_KEY,Department);
               startActivity(intent);
           }
       });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        int image_id=data.getExtras().getInt(VALUE_KEY);
        //Log.d("demos", image_id);
       // int image_id_int =Integer.parseInt(image_id);
        ImageView iv=(ImageView) findViewById(R.id.avatar_select);

        if(requestCode == Request_code){
            if(resultCode == RESULT_OK){
            if(image_id == R.id.first_avatar) {
                iv.setImageResource(R.drawable.avatar_f_1);
                Flag_KEY="first_avatar";
            }
                if(image_id == R.id.second_avatar) {
                    iv.setImageResource(R.drawable.avatar_f_2);
                    Flag_KEY="second_avatar";
                }
                if(image_id == R.id.third_avatar) {
                    iv.setImageResource(R.drawable.avatar_f_3);
                    Flag_KEY="third_avatar";
                }
                if(image_id == R.id.fourth_avatar) {
                    iv.setImageResource(R.drawable.avatar_m_1);
                    Flag_KEY="fourth_avatar";
                }
                if(image_id == R.id.fifth_avatar) {
                    iv.setImageResource(R.drawable.avatar_m_2);
                    Flag_KEY="fifth_avatar";
                }
                if(image_id == R.id.sixth_avatar) {
                    iv.setImageResource(R.drawable.avatar_m_3);
                    Flag_KEY="sixth_avatar";
                }



            }
        }

    }



}
