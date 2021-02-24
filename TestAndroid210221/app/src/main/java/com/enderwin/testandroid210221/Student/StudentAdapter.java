package com.enderwin.testandroid210221.Student;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.enderwin.testandroid210221.R;
import com.enderwin.testandroid210221.Student.Student;

import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(@NonNull Context context, List<Student> students) {
        super(context, R.layout.adapter_item, students);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }

        TextView tv_name, tv_group, tv_age, tv_score;

        tv_name = convertView.findViewById(R.id.tv_name);
        tv_group = convertView.findViewById(R.id.tv_group);
        tv_age = convertView.findViewById(R.id.tv_age);
        tv_score = convertView.findViewById(R.id.tv_score);
        tv_name.setText(student.getName());
        tv_group.setText(student.getGroup());
        tv_age.setText(student.getAge().toString());
        tv_score.setText(student.getScore().toString());

        return convertView;
    }
}
