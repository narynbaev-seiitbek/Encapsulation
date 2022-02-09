package GetterSetter;

import java.time.LocalDate;
import java.util.Arrays;

public class Group{
    private Student[] students;
    private String subject;
    private LocalDate dateOfStartEducation;
    public Group() {
    }

    public Group(Student[] students, String subject, LocalDate dateOfStartEducation) {
        this.students = students;
        this.subject = subject;
        this.dateOfStartEducation = dateOfStartEducation;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {

        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDateOfStartEducation() {
        return dateOfStartEducation;
    }

    public void setDateOfStartEducation(LocalDate dateOfStartEducation) {
        this.dateOfStartEducation = dateOfStartEducation;
    }

    @Override
    public String toString() {
        return "Group information: " +'\n'+
                "subject: " + subject + '\n' +
                "date of start education: " + dateOfStartEducation +'\n'+
               "quantity of students: "  + students.length+'\n'+
                Arrays.toString(students);
    }
}
