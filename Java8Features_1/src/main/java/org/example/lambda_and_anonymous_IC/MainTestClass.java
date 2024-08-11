package org.example.lambda_and_anonymous_IC;

public class MainTestClass {
  int l = 34; //Instance variable
  public static void main(String[] args) {
    //Since we cannot directly create
    //an object of interface so we can do so using
    //anonymous inner classes thereby implementing them
    Employee employee = new Employee() {
      @Override
      public String getSalary() {
        return "99";
      }

      @Override
      public String getDesignation() {
        return "Software Engineer";
      }
    };
  }

  public static void doSomething() {

    int a = 4; //Local variable

    NewAgeEmployee newAgeEmployee = ()-> {
      int b = 5; //local variable
      return "1400";
    };


    System.out.println("New Age Employee's salary"+newAgeEmployee.getSalary());
  }


}
