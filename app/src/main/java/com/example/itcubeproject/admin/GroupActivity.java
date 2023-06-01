package com.example.itcubeproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.itcubeproject.R;

public class GroupActivity extends AppCompatActivity {

    Animation buttonAnim;

    @Override @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        Button rightTopButton = (Button) findViewById(R.id.rightTopButton);
        rightTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGroupDialog();
            }
        });
    }
    private void showGroupDialog() {
        Button popupButton;
        Button popupButton1;
        Button popupButton2;
        final Dialog groupDialog = new Dialog(this);
        groupDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        groupDialog.setContentView(R.layout.group_popup);
        groupDialog.show();
        groupDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        groupDialog.getWindow().setGravity(Gravity.CENTER);
        popupButton = groupDialog.findViewById(R.id.button);
        popupButton1 = groupDialog.findViewById(R.id.button1);
        popupButton2 = groupDialog.findViewById(R.id.button2);
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupDialog.dismiss();
                Intent intent = new Intent(GroupActivity.this, TeacherAddActivity.class);
                startActivity(intent);
            }
        });
        popupButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupDialog.dismiss();
                Intent intent = new Intent(GroupActivity.this, StudentAddActivity.class);
                startActivity(intent);
            }
        });
        popupButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupDialog.dismiss();
                Intent intent = new Intent(GroupActivity.this, GroupsActivity.class);
                startActivity(intent);
            }
        });
    }
}