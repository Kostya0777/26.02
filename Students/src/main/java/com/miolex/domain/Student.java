/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miolex.domain;

/**
 *
 * @author OLEX
 */
public class Student extends Person{
    private String studentId;

    private String group;
    private String departament;
    private String discipline;
    private String mark;
    private String teacherName;

    public Student(String studentId, String group, String departament, String surname, String name) {
        super(surname, name);
        this.studentId = studentId;
        this.group = group;
        this.departament = departament;
    }

    

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", surname=" + super.getSurname() + ", name=" + super.getName() + ", group=" + group + ", departament=" + departament + ", discipline=" + discipline + ", mark=" + mark + ", teacherName=" + teacherName + '}' + '\n';
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGroup() {
        return group;
    }

    public String getDepartament() {
        return departament;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getMark() {
        return mark;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
