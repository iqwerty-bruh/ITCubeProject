package com.example.itcubeproject.registration;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itcubeproject.R;

public class MainActivity extends AppCompatActivity {
    Animation buttonAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) (findViewById(R.id.authButton));
        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button2 = (Button) (findViewById(R.id.requestButton));
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button1.startAnimation(buttonAnim);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.startAnimation(buttonAnim);
                Intent intent = new Intent(MainActivity.this, RequestActivity.class);
                startActivity(intent);
            }
        });
    }
}