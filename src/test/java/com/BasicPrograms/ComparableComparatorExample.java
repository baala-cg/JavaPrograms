package com.BasicPrograms;

import java.util.*;

//Student class implementing Comparable
class Student implements Comparable<Student> {
 int id;
 String name;

 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Comparable: sort by id
 public int compareTo(Student s) {
     return this.id - s.id;
 }
}

//Comparator: sort by name
class NameComparator implements Comparator<Student> {
 public int compare(Student s1, Student s2) {
     return s1.name.compareTo(s2.name);
 }
}

public class ComparableComparatorExample {
 public static void main(String[] args) {
     ArrayList<Student> list = new ArrayList<>();

     list.add(new Student(3, "Ravi"));
     list.add(new Student(1, "Amit"));
     list.add(new Student(2, "Sita"));

     // Using Comparable (sort by id)
     Collections.sort(list);
     System.out.println("Sorted by ID:");
     for (Student s : list) {
         System.out.println(s.id + " " + s.name);
     }

     // Using Comparator (sort by name)
     Collections.sort(list, new NameComparator());
     System.out.println("\nSorted by Name:");
     for (Student s : list) {
         System.out.println(s.id + " " + s.name);
     }
 }
}
