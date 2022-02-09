package GetterSetter;

import java.util.Arrays;

public class Course {

    private String courseName;
    private int courseNumber;
    private String teacherName;
    private String teacherLastName;
    private Group[] groups;

    public Course() {
    }

    public Course(String courseName, int courseNumber, String teacherName, String teacherLastName, Group[] groups) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.teacherName = teacherName;
        this.teacherLastName = teacherLastName;
        this.groups = groups;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course information: " +'\n' +
                "course Name: " + courseName + '\n' +
                "course Number: " + courseNumber +'\n' +
                "teacher Name: " + teacherName + '\n' +
                "teacher Last Name: " + teacherLastName + '\n' +
                "Quantity of groups: " + groups.length ;
    }
}
