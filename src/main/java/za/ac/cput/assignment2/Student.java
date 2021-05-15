package za.ac.cput.assignment2;

public class Student {
    private String studentNumber;
    private String name;
    private String surname;
    private String student_class;

    public Student(String studentNumber, String name, String surname, String student_class) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.student_class = student_class;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getName(String studentNumber) {
        String name = "";
        if(studentNumber == this.getStudentNumber()){
            name= this.name;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }
}
