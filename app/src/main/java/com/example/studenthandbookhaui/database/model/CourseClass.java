package com.example.studenthandbookhaui.database.model;

public class CourseClass extends BaseModel {
    private String name;
    private String courseCode;
    private int courseLoadTheoretical;
    private int courseLoadPractical;

    public CourseClass() {}

    public CourseClass(String name, String courseCode, int courseLoadTheoretical, int courseLoadPractical) {
        this.name = name;
        this.courseCode = courseCode;
        this.courseLoadTheoretical = courseLoadTheoretical;
        this.courseLoadPractical = courseLoadPractical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseLoadTheoretical() {
        return courseLoadTheoretical;
    }

    public void setCourseLoadTheoretical(int courseLoadTheoretical) {
        this.courseLoadTheoretical = courseLoadTheoretical;
    }

    public int getCourseLoadPractical() {
        return courseLoadPractical;
    }

    public void setCourseLoadPractical(int courseLoadPractical) {
        this.courseLoadPractical = courseLoadPractical;
    }
}
