package com.example.itcubeproject.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.itcubeproject.R;

public class GroupsActivity extends AppCompatActivity {

    Animation buttonAnim;
    ListView groupsList;
    Dialog groupsDialog;

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        buttonAnim = AnimationUtils.loadAnimation(this, R.anim.buttonanim);
        groupsList = findViewById(R.id.groupsList);
        groupsDialog = new Dialog(this);
        Button rightTopButton = findViewById(R.id.rightTopButton);

        String[] groups = {
                "Samsung IT-SCHOOL",
                "Яндекс Лицей",
                "Программирование на Java",
                //просто чтоб глянуть как смотрится
        };
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.schedule_item, R.id.scheduleElement, groups);
        groupsList.setAdapter(arrayAdapter);
        groupsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GroupsActivity.this, GroupActivity.class);
                startActivity(intent);
            }
        });
        rightTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGroupsDialog();
            }
        });
    }

    private void showGroupsDialog() {
        Button popupButton1;
        Button popupButton2;
        final Dialog groupsDialog = new Dialog(this);
        groupsDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        groupsDialog.setContentView(R.layout.groups_popup);
        groupsDialog.show();
        groupsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        groupsDialog.getWindow().setGravity(Gravity.CENTER);
        popupButton1 = (Button) groupsDialog.findViewById(R.id.button1);
        popupButton2 = (Button) groupsDialog.findViewById(R.id.button2);
        popupButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupsDialog.dismiss();
               showGroupAddDialog();
            }
        });
        popupButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupsDialog.dismiss();
                Intent intent = new Intent(GroupsActivity.this, MainAdminActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showGroupAddDialog() {
        final Dialog groupAddDialog = new Dialog(this);
        groupAddDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        groupAddDialog.setContentView(R.layout.group_add_layout);
        groupAddDialog.show();
        groupAddDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        groupAddDialog.getWindow().setGravity(Gravity.CENTER);
        Button finishButton = groupAddDialog.findViewById(R.id.finishButton);
        EditText editText = groupAddDialog.findViewById(R.id.editText);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getEditableText().toString().trim().equals("")) {
                    groupAddDialog.dismiss();

                } else {
                    groupAddDialog.dismiss();

                }
            }
        });
    }
}