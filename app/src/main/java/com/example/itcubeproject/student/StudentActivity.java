package com.example.itcubeproject.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.itcubeproject.R;

public class StudentActivity extends AppCompatActivity {
    ListView scheduleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        scheduleList = (ListView) findViewById(R.id.scheduleListView);

        String[] schedules = {
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
        };
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.schedule_item,R.id.scheduleElement,schedules);
        scheduleList.setAdapter(arrayAdapter);
    }
}