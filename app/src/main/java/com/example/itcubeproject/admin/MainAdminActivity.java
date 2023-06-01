package com.example.itcubeproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.itcubeproject.R;
import com.example.itcubeproject.registration.MainActivity;
import com.example.itcubeproject.registration.MainActivity2;
import com.example.itcubeproject.registration.RequestActivity;

public class MainAdminActivity extends AppCompatActivity {

    Animation buttonAnim;
    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);
        Button button1 = (Button) findViewById(R.id.acceptButton);
        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        Button button2 = (Button) (findViewById(R.id.managementButton));
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button1.startAnimation(buttonAnim);
                Intent intent = new Intent(MainAdminActivity.this, AcceptActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.startAnimation(buttonAnim);
                Intent intent = new Intent(MainAdminActivity.this, GroupsActivity.class);
                startActivity(intent);
            }
        });

    }
}