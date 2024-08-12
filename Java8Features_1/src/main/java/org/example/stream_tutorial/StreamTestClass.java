package org.example.stream_tutorial;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTestClass {

  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
      new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
      new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
      new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
      new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
      new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
      new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
      new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
      new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
      new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
      new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


    //Q1. Find list of Students whose first name starts with alphabet "A"
    List<Student> lstStuName = list.stream().filter(dt->dt.getFirstName().startsWith("A")).collect(Collectors.toList());
    System.out.println(lstStuName);

    // Q2. Find list of students whose first name does not start with "A"
    List<Student> studentList = list.stream().filter(student -> !student.getFirstName().startsWith("A")).toList();
    System.out.println(studentList);

    //Q3. Find list of students whose age < 27
    List<Student> studentList1 = list.stream().filter(student -> student.getAge()<27).collect(Collectors.toList());
    System.out.println(studentList1);

    //Q4. Group the student by department names
    Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName));
    System.out.println(mapData);

//    Q5. Group the students by age
    Map<Integer, List<Student>> listMap = list.stream().collect(Collectors.groupingBy(Student::getAge));
    System.out.println(listMap);

    //Q6. Find the total count of student using stream
    long countStudentAll = list.stream().count();
    System.out.println(countStudentAll);

    //Q7. Find the distinct students
    long countStudent = list.stream().distinct().count();
    System.out.println(countStudent);


    //Q8. Find the max age of student
    OptionalInt maxAge = list.stream().mapToInt(dt-> dt.getAge()).max();
    System.out.println(maxAge.getAsInt());

    //Q9. Find the min age of student
    OptionalInt minAge = list.stream().mapToInt(dt->dt.getAge()).min();
    System.out.println(minAge.getAsInt());

    //Q10. Find all department names
    List<String> departMentList = list.stream().map(dt->dt.getDepartmentName()).collect(Collectors.toList());
    System.out.println(departMentList);

    //Q11. Find the count of student in each department
    Map<String, Long> countStudentInEachDept = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,
      Collectors.counting()));
    System.out.println("Student count in each department: "+countStudentInEachDept);

    //Q12. Find the list of students whose age is less than 30
    List<Student> list1 = list.stream().filter(dt->dt.getAge()<30).collect(Collectors.toList());
    System.out.println(list1);

//    Q13. Find the list of students whose rank is between 50 and 100
    List<Student> list2 = list.stream().filter(dt->dt.getRank()>50 && dt.getRank()<100).collect(Collectors.toList());
    System.out.println(list2);

//    Q14. Find the average age of male and female students;
    Map<String, Double>  mapStudent = list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
    System.out.println("Average age "+mapStudent);

    //Q15. Find the department which is having maximum number of students
    Map.Entry<String, Long> entry = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.counting())).entrySet().stream()
      .max(Map.Entry.comparingByValue()).get();
    System.out.println(entry);

//    Q16. Find the students who stays in Delhi and Sort them by their names
    List<Student> list3 = list.stream().filter(student -> student.getCity().equals("Delhi"))
      .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
    System.out.println(list3);

//    Q17. Find the average rank in all departments
    Map<String, Double> map2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName
      , Collectors.averagingInt(Student::getRank)));
    System.out.println(map2);

    //Q18. Find the highest rank in each department
    Map<String, Optional<Student>> map3 = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,
      Collectors.minBy(Comparator.comparing(Student::getRank))));
    System.out.println(map3);

//    Q19. Find the list of Students and sort them by their rank
    List<Student> stuRankSorted = list.stream().sorted(Comparator.comparing(Student::getRank))
      .collect(Collectors.toList());
    System.out.println("List of students sorted by their rank: "+stuRankSorted);

//    Q20. Find the student who has second rank
    Student student = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
    System.out.println("Second highest rank Student: "+student);

  }

}
