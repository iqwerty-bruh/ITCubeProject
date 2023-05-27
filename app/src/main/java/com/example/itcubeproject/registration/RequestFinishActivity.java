package com.example.itcubeproject.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.itcubeproject.R;

public class RequestFinishActivity extends AppCompatActivity {
Animation buttonAnim;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_finish);
        Button button1 = (Button) (findViewById(R.id.backButton));
        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        TextView codeTextView = (TextView) findViewById(R.id.codeTextView);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button2 = (Button) (findViewById(R.id.requestButton));
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button1.startAnimation(buttonAnim);
                Intent intent = new Intent(RequestFinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}