package com.example.itcubeproject.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.itcubeproject.R;

public class TeacherActivity extends AppCompatActivity {
    ListView scheduleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        scheduleList = (ListView) findViewById(R.id.scheduleListView1);

        String[] schedules = {
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                "Расписание Samsung IT-School\n16:50-18:20\n17:40-19:10",
                //просто чтоб глянуть как смотрится
        };
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.schedule_item,R.id.scheduleElement,schedules);
        scheduleList.setAdapter(arrayAdapter);
    }
}