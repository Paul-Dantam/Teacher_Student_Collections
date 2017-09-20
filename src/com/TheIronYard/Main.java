package com.TheIronYard;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();

        HashSet<Student> studentSet1 = new HashSet<>();
        HashSet<Student> studentSet2 = new HashSet<>();
        HashSet<Student> studentSet3 = new HashSet<>();
        HashMap<Teacher, Set> studentMap = new HashMap<>();



        studentList.add(new Student("Steve", "Smith", 11, 1));
        studentList.add(new Student("Bob", "Smith", 12, 1));
        studentList.add(new Student("Sally", "Smith", 13, 1));
        studentList.add(new Student("Arnold", "Smith", 14, 1));
        studentList.add(new Student("Betty", "Smith", 15, 1));
        studentList.add(new Student("Jerry", "Smith", 16, 1));
        studentList.add(new Student("Rick", "Smith", 17, 1));
        studentList.add(new Student("Morty", "Smith", 18, 1));
        studentList.add(new Student("Beth", "Smith", 19, 1));
        studentList.add(new Student("Evan", "Smith", 20, 1));
        studentList.add(new Student("Jackson", "Smith", 21, 1));
        studentList.add(new Student("Gordon", "Smith", 22, 1));
        studentList.add(new Student("Morgan", "Smith", 23, 1));
        studentList.add(new Student("Felicia", "Smith", 24, 1));
        studentList.add(new Student("Eric", "Smith", 25, 1));
        studentList.add(new Student("Steve", "Smith", 26, 1));

        teacherList.add(new Teacher("Ernst", "Bakunin", 101, 1));
        teacherList.add(new Teacher("Hermann", "Mendel", 101, 1));
        teacherList.add(new Teacher("Hjalmer", "Mises", 101, 1));


        studentSet1.add(studentList.get(0));
        studentSet1.add(studentList.get(1));
        studentSet1.add(studentList.get(2));
        studentSet1.add(studentList.get(3));
        studentSet1.add(studentList.get(4));

        studentSet2.add(studentList.get(5));
        studentSet2.add(studentList.get(6));
        studentSet2.add(studentList.get(7));
        studentSet2.add(studentList.get(8));
        studentSet2.add(studentList.get(9));

        studentSet3.add(studentList.get(10));
        studentSet3.add(studentList.get(11));
        studentSet3.add(studentList.get(12));
        studentSet3.add(studentList.get(13));
        studentSet3.add(studentList.get(14));

        studentMap.put(teacherList.get(0), studentSet1);
        studentMap.put(teacherList.get(1), studentSet2);
        studentMap.put(teacherList.get(2), studentSet3);


        Set studentKeys = studentMap.keySet();
        Set studentValues = studentMap.values();

        for(Key )



    }
}