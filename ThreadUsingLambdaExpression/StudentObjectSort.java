package ThreadUsingLambdaExpression;

import java.util.*;

public class StudentObjectSort {
    public static void main(String[] args) {
        Student s1= new Student(1,"Aprajita");
        Student s2= new Student(2,"keshav");
        Student s3= new Student(3,"poonam");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Comparator<Student> c = (a,b) ->{
            return b.id-a.id;
        };
        Collections.sort(list,c);
        System.out.println(list);

    }
}
