package org.example.comparator_using_lambda;

import java.util.*;

public class MyTestClass {
  public static void main(String[] args) {
    Integer a[] = { 2, 3, 4, 5, 1, 35, 9, 90};
    List<Integer> list = Arrays.asList(a);

    List<Integer> practicelist = new LinkedList<>();
    practicelist.add(2);
    practicelist.add(4);
    practicelist.add(1);
    practicelist.add(9);
    practicelist.add(3);
    Comparator<Integer> comparator = (b, c)-> c-b;
//    Collections.sort(practicelist, new MyCompareClass());
//    Collections.sort(practicelist, comparator);
//or
    Collections.sort(practicelist, (b,c)->c-b);
    System.out.println(practicelist);


    //Same comparators can be used with sets
    Set<Integer> s = new TreeSet<>();
    s.add(4);
    s.add(4);
    s.add(12);
    s.add(2);
    System.out.println("Natural sorted order "+s);
    Set<Integer> s1 = new TreeSet<>((x,y)->y-x); //Here we have passed implementation
                                                  //of Comparator<T> compare method
    s1.add(4);
    s1.add(4);
    s1.add(12);
    s1.add(2);
    System.out.println("Descending Treeset "+s1);


    //The treemap is ordered based on key not value
    Map<Integer, String > m = new TreeMap<>();
    m.put(2, "frog");
    m.put(3, "Zero");
    m.put(12, "Aero");
    m.put(21, "Groot");
    System.out.println("Map in natural order "+m);
    Map<Integer, String> mp = new TreeMap<>((i,j)->j-i);
    mp.put(2, "frog");
    mp.put(3, "Zero");
    mp.put(12, "Aero");
    mp.put(21, "Groot");
    System.out.println("Map post Comparator "+mp);


    Student student = new Student("Mayank", 1);
    Student student1 = new Student("Monkey", 2);
    Student student2 = new Student("Hellooo", 0);

    List<Student> studentList = new ArrayList<>();
    studentList.add(student);
    studentList.add(student1);
    studentList.add(student2);

    //Sorting in descending order based on id
    Collections.sort(studentList, (x, y)->y.getId()-x.getId());
    System.out.println(studentList);

  }
}
