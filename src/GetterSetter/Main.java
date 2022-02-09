package GetterSetter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sadyr","Japarov",
                LocalDate.of(1965,02,9),"sadyr@mail.ru");
        Student student2 = new Student("Azat","Ibraev",
                LocalDate.of(1989,8,28),"azat@mail.ru");
        Student student3 = new Student("Seiitbek","Narynbaev",
                LocalDate.of(1990,03,12),"seitkg@mail.ru");

        Group group1 = new Group(new Student[]{student1,student2},"Java Script",
                LocalDate.of(2022,04,01));
        Group group2 = new Group(new Student[]{student3},"Java",
                LocalDate.of(2022,04,03));


        Course course1 = new Course("Java",5,"Muhammad",
                "Allanov",new Group[]{group1,group2});

        System.out.println(course1);





















    }
}
