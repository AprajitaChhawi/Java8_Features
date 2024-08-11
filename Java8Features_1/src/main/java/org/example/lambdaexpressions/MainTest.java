package org.example.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class MainTest {
  public static void main(String[] args) {
//    Employee employee = new SoftwareEngineer();
//    System.out.println(employee.getName());
    //Instead of writing this we could have made use of Lambda Expressions
    Employee employee = () -> {
      return "Software Engineer";
    };

    // or

    Employee employee1 = () -> "Software Engineer";

    System.out.println(employee.getName());
    System.out.println(employee1.getName());

    Employee editor = () -> "Editor";
    System.out.println(editor.getName());
    //Observe here that we are not required to write new implementations
    //for each class we can directly implement them inline

    //Some examples of Lambda expressions
    //1. public int sum(int a, int b) {
    //    return a+b;
    //  }

    BinaryOperator<Integer> sum = (a, b) -> a+b;

    int result = sum.apply(5, 6);
    System.out.println(result);

    BinaryOperator<Integer> product = (a, b) -> a*b;
    System.out.println(product.apply(5,6));

    //Or same thing in custom manner
    MiMathematicia miMathematicia = (a, b)->a*b;
    System.out.println(miMathematicia.operation(5,7));
    Integer a[] = {5, 6, 2};
    List<Integer> list = Arrays.asList(a);
    Sort sort = (list1)->{
      Collections.sort(list1);
      return list1;
    };

    System.out.println(sort.sort(list));


  }
}
