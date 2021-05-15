package za.ac.cput.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationTest {
    //Collection
    @Test
    void testAddStudent(){
        Collection<Student> students= new ArrayList<Student>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.addStudent(students);
        Assertions.assertEquals(2, size);
    }

    @Test
    void testRemoveStudent(){
        Collection<Student> students= new ArrayList<Student>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.removeStudent(students,st1);
        Assertions.assertEquals(1, size);
    }

    @Test
    void testFindStudentName(){
        Collection<Student> students= new ArrayList<Student>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        String studentName = StudentRegistration.searchStudentName(students,"218321392");
        Assertions.assertEquals("Michel", studentName);
    }

    //Map Collection Test

    @Test
    void testAddStudentWithMap() {
        Map<Integer,Student> students = new HashMap<>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.put(100,st1);
        students.put(101,st2);
        int size = StudentRegistration.addStudentWithMap(students);
        Assertions.assertEquals(2, size);

    }

    @Test
    void testRemoveStudentWithMap() {
        Map<Integer,Student> students = new HashMap<Integer,Student>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.put(100,st1);
        students.put(101,st2);
        StudentRegistration.removeStudentWithMap(students,100);
        Assertions.assertEquals(1, students.size());

    }

    @Test
    void testFindStudentNumber(){
        Map<Integer,Student> students = new HashMap<Integer,Student>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.put(100,st1);
        students.put(101,st2);
        String donationAmount= StudentRegistration.findStudentNumber(students,101);
        Assertions.assertEquals("Umba", donationAmount);
    }

    //Set Collection

    @Test
    void testAddStudentWithSet(){
        Set<Student> students = new LinkedHashSet<>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.addStudentWithSet(students);
        Assertions.assertEquals(2, size);
    }

    @Test
    void testRemoveStudentWithSet(){
        Set<Student> students = new LinkedHashSet<>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.removeStudentWithSet(students,st1);
        Assertions.assertEquals(1, size);
    }

    @Test
    void TestFindStudentWithSet(){
        Set<Student> students = new LinkedHashSet<>();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        boolean found = StudentRegistration.findStudentWithSet(students,st1);
        Assertions.assertEquals(true, found);
    }

    //list Collection


    @Test
    void testAddStudentWithList(){
        List students = new LinkedList();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.addStudentWithList(students);
        Assertions.assertEquals(2, size);
    }

    @Test
    void TestRemoveStudentWithList(){
        List students = new LinkedList();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        int size = StudentRegistration.removeStudentWithList(students,1);
        Assertions.assertEquals(1, size);
    }

    @Test
    void testSearchStudent(){
        List students = new LinkedList();
        Student st1 = new Student("218321392","Michel","Muembo","first year");
        Student st2 = new Student("219292694","Umba","Joseph","Third year");
        students.add(st1);
        students.add(st2);
        boolean found = StudentRegistration.searchStudent(students,st1);
        Assertions.assertEquals(true, found);
    }



}