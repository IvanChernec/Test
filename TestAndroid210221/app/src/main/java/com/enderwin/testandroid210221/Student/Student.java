package com.enderwin.testandroid210221.Student;

public class Student {
    private String name, group;
    private Integer age, score;

    public Student(String name, String group, Integer age) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
