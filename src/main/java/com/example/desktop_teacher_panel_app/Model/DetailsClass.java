package com.example.desktop_teacher_panel_app.Model;

import java.util.List;

public class DetailsClass {

    private String teacherName,subjectName,department,classLocation,todayTopic,keyText,minutes;

    public DetailsClass(String teacherName, String subjectName, String department, String classLocation, String todayTopic,String minutes) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
        this.department = department;
        this.classLocation = classLocation;
        this.todayTopic = todayTopic;
        this.minutes = minutes;
    }



    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName=teacherName;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getTodayTopic() {
        return todayTopic;
    }

    public void setTodayTopic(String todayTopic) {
        this.todayTopic = todayTopic;
    }

    public String getKeyText() {
        return keyText;
    }

    public void setKeyText(String keyText) {
        this.keyText = keyText;
    }
}
