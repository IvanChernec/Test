package com.enderwin.testandroid210221.Student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.enderwin.testandroid210221.MainActivity;
import com.enderwin.testandroid210221.R;

public class StudentAdd extends AppCompatActivity {
    private EditText et_name, et_group, et_age;
    private AppCompatButton btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_add);

        et_name = findViewById(R.id.et_name);
        et_group = findViewById(R.id.et_group);
        et_age = findViewById(R.id.et_age);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("name", et_name.toString());
                i.putExtra("group", et_group.toString());
                i.putExtra("age", et_age.toString());
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}