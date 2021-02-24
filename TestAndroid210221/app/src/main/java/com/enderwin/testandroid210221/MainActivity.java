package com.enderwin.testandroid210221;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.enderwin.testandroid210221.Student.Student;
import com.enderwin.testandroid210221.Student.StudentAdapter;
import com.enderwin.testandroid210221.Student.StudentAdd;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> list;
    private ListView lv_students;
    private StudentAdapter studentAdapter;
    private AppCompatButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);
        lv_students = findViewById(R.id.lv_student);
        list = new ArrayList<>();
        list.add(new Student("ffff", "dddd", 18));
        studentAdapter = new StudentAdapter(this, list);
        lv_students.setAdapter(studentAdapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentAdd.class);
                startActivityForResult(i, 1);
            }
        });
    }

    @Override
    protected void onResume() {
        update();
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case RESULT_OK:
                list.add(new Student(data.getStringExtra("name"),
                        data.getStringExtra("group"),
                        Integer.valueOf(data.getStringExtra("age"))));
        }
    }

    public void update(){
        studentAdapter.notifyDataSetChanged();
    }
    
}