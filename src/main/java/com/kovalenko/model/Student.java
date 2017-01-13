package com.kovalenko.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "table1", catalog = "weblab")
public class Student implements Serializable{

    private Integer studentId;
    private Integer studentRegion;
    private Integer studentClass;
    private Integer subj1Mark;
    private Integer subj2Mark;
    private Integer subj3Mark;

    public Student() {
    }

    public Student(Integer studentRegion, Integer studentClass, Integer subj1Mark, Integer subj2Mark, Integer subj3Mark) {
        this.studentRegion = studentRegion;
        this.studentClass = studentClass;
        this.subj1Mark = subj1Mark;
        this.subj2Mark = subj2Mark;
        this.subj3Mark = subj3Mark;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", unique = true, nullable = false)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Column(name = "student_region", nullable = false)
    public Integer getStudentRegion() {
        return studentRegion;
    }

    public void setStudentRegion(Integer studentRegion) {
        this.studentRegion = studentRegion;
    }

    @Column(name = "student_class", nullable = false)
    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    @Column(name = "subj_1_mark", nullable = false)
    public Integer getSubj1Mark() {
        return subj1Mark;
    }

    public void setSubj1Mark(Integer subj1Mark) {
        this.subj1Mark = subj1Mark;
    }

    @Column(name = "subj_2_mark", nullable = false)
    public Integer getSubj2Mark() {
        return subj2Mark;
    }

    public void setSubj2Mark(Integer subj2Mark) {
        this.subj2Mark = subj2Mark;
    }

    @Column(name = "subj_3_mark", nullable = false)
    public Integer getSubj3Mark() {
        return subj3Mark;
    }

    public void setSubj3Mark(Integer subj3Mark) {
        this.subj3Mark = subj3Mark;
    }
}
