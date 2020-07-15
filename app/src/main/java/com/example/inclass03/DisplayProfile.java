package com.example.inclass03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.inclass03.MainActivity.DPT_KEY;
import static com.example.inclass03.MainActivity.Image_KEY;
import static com.example.inclass03.MainActivity.SID_KEY;

public class DisplayProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_profile);

        TextView profile_name = findViewById(R.id.Profile_Name);
        TextView Student_id =findViewById(R.id.Profile_SID);
        TextView department_id=findViewById(R.id.Profile_Dept);
        ImageView image = (ImageView) findViewById(R.id.profile_avatar);
        if(getIntent() != null && getIntent().getExtras() != null) {


            if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("first_avatar")) {
                image.setImageResource(R.drawable.avatar_f_1);
            } else if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("second_avatar")) {
                image.setImageResource(R.drawable.avatar_f_2);
            } else if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("third_avatar")) {
                image.setImageResource(R.drawable.avatar_f_3);
            } else if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("fourth_avatar")) {
                image.setImageResource(R.drawable.avatar_m_1);
            } else if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("fifth_avatar")) {
                image.setImageResource(R.drawable.avatar_m_2);
            } else if (getIntent().getExtras().getString(MainActivity.Image_KEY).equals("sixth_avatar")) {
                image.setImageResource(R.drawable.avatar_m_3);
            }
            profile_name.setText(getIntent().getExtras().getString(MainActivity.FName_key) + " " + getIntent().getExtras().getString(MainActivity.LName_KEY));
            Student_id.setText(getIntent().getExtras().getString(SID_KEY));
            department_id.setText(getIntent().getExtras().getString(DPT_KEY));
        }
       findViewById(R.id.Edit_Button).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
    }
}
