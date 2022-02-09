package GetterSetter;

import java.time.LocalDate;

public class Student {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private byte age;
    private String email;

    public Student() {

    }

    public Student(String name, String lastName, LocalDate dateOfBirth, String email) {

        if (!name.matches("[A-Za-z]*")) {
            System.err.println("You enter invalid name [" + name + "]");
        } else {
            this.name = name;
        }

        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.err.println("You enter invalid date of birth [" + dateOfBirth+"]");
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        this.age = (byte) (LocalDate.now().getYear() - dateOfBirth.getYear());
        this.email = email;
        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z]*")) {
            System.err.println("You enter invalid name [" + name + "]");
        } else {
            this.name = name;
        }
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.err.println("You enter invalid date of birth [" + dateOfBirth+"]");
        } else {
            this.dateOfBirth = dateOfBirth;
        }

    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student information: " +'\n'+
                "name: " + name + '\n' +
                "lastName: " + lastName + '\n' +
                "date Of Birth: " + dateOfBirth +'\n'+
                "age: " + age +'\n'+
                "email: " + email + '\n';
    }
}
