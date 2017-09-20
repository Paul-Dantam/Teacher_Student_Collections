package com.TheIronYard;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();


        for(int i = 0; i < 15; i++){
            studentList.add(new Student("Pickle", "Rick", i, 1));
        }

        ArrayList<Teacher> teacherList = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            teacherList.add(new Teacher("Hjalmer", "Mises", i, 1));
        }

        HashSet<Student> studentSet1 = new HashSet<>();
        studentSet1.add(studentList.get(0));
        studentSet1.add(studentList.get(1));
        studentSet1.add(studentList.get(2));
        studentSet1.add(studentList.get(3));
        studentSet1.add(studentList.get(4));

        HashSet<Student> studentSet2 = new HashSet<>();
        studentSet2.add(studentList.get(5));
        studentSet2.add(studentList.get(6));
        studentSet2.add(studentList.get(7));
        studentSet2.add(studentList.get(8));
        studentSet2.add(studentList.get(9));

        HashSet<Student> studentSet3 = new HashSet<>();
        studentSet3.add(studentList.get(10));
        studentSet3.add(studentList.get(11));
        studentSet3.add(studentList.get(12));
        studentSet3.add(studentList.get(13));
        studentSet3.add(studentList.get(14));

        HashMap<Teacher, Set> teacherMap = new HashMap<>();
        teacherMap.put(teacherList.get(0), studentSet1);
        teacherMap.put(teacherList.get(1), studentSet2);
        teacherMap.put(teacherList.get(2), studentSet3);

        for(Teacher teacher : teacherMap.keySet()) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
        }

            for (Set studentSet : teacherMap.values()) {
                for ( Student s : (HashSet<Student>) studentSet){
                    System.out.println(s.getFirstName() + " " + s.getLastName());
                }
            }
    }
}