package com.example.itcubeproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.itcubeproject.R;

public class AcceptActivity extends AppCompatActivity {
    Animation buttonAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept2);
        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button acceptButton = (Button) findViewById(R.id.acceptButton);
        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acceptButton.startAnimation(buttonAnim);
                //навали жестко тут базы
            }
        });
    }
}