package com.example.itcubeproject.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.itcubeproject.R;

public class RequestActivity extends AppCompatActivity {
    Animation buttonAnim;
    final String[] napravleniya = { "стать питонистом", "стать калоедом", "стать джедаем", "стать долбоебом", "стать джава-разработчиком"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        Button furtherButton = (Button) (findViewById(R.id.furtherButton));
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        EditText editText6 = (EditText) findViewById(R.id.editText6);
        EditText editText7 = (EditText) findViewById(R.id.editText7);
        EditText editText8 = (EditText) findViewById(R.id.editText8);

        Spinner spinner = findViewById(R.id.editText4);
        spinner.setAdapter(new ArrayAdapter<>(this,
                R.layout.autocompletelayout,R.id.autoTextView, napravleniya));

        buttonAnim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        furtherButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                furtherButton.startAnimation(buttonAnim);
                if(editText1.getEditableText().toString().trim().equals("") || editText2.getEditableText().toString().trim().equals("") || editText3.getEditableText().toString().trim().equals("") || editText5.getEditableText().toString().trim().equals("") || editText6.getEditableText().toString().trim().equals("") || editText7.getEditableText().toString().trim().equals("") || editText8.getEditableText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Не все поля заполнены!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(RequestActivity.this, RequestActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}