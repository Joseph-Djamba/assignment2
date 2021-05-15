package za.ac.cput.assignment2;

import java.util.*;

public class StudentRegistration {

    public static int addStudent(Collection collection){
        int size;
        size = collection.size();
        return size;
    }

    public static int removeStudent(Collection collection, Student student)
    {
        int size;
        collection.remove(student);
        return size = collection.size();
    }

    public static String searchStudentName(Collection collection, String pStudentNumber)
    {
        String studentName = "";
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Student st = (Student) iterator.next();
            String studentNumber = st.getStudentNumber();
            if(studentNumber == pStudentNumber){
                studentName = st.getName(studentNumber);
                break;
            }

        }
        return studentName;
    }

    //Map Collection
    public static int addStudentWithMap(Map<Integer,Student> map){
        int size;
        size = map.size();
        return size;
    }
    public static void removeStudentWithMap(Map<Integer,Student> map,int key){
        map.remove(key);

    }
    public static String findStudentNumber(Map<Integer,Student> map,int key){
        String studentName;
        studentName= map.get(key).getName();
        return studentName;
    }

    //Set Collection
    public static int addStudentWithSet(Set<Student> set){
        int size;
        size = set.size();
        return size;

    }
    public static int removeStudentWithSet(Set<Student> set, Student student)
    {
        int size;
        set.remove(student);
        size = set.size();
        return size;

    }
    public static boolean findStudentWithSet(Set<Student> set, Student student)
    {
        boolean found = set.contains(student);
        return found;

    }

    //List Collection

    public static int addStudentWithList(List list){
        int size;
        size= list.size();
        return size;
    }

    public static int removeStudentWithList(List students,int index){
        int size;
        students.remove(index);
        size = students.size();
        return size;
    }

    public static boolean searchStudent(List students,Student student){
        boolean found = students.contains(student);
        return found;
    }

}
