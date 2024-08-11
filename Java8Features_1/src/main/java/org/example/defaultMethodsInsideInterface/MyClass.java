package org.example.defaultMethodsInsideInterface;


//Post java 8 we can now declare concrete methods inside interfaces

import org.example.C;

interface Parent {
  default void sayHello() {
    System.out.println("Hello");
  }
}

interface ParentB {
  default void sayHello() {
    System.out.println("Hello");
  }
}

class Child implements Parent {
  @Override
  public void sayHello() {
    System.out.println("Child says hello.");
  }
}

public class MyClass implements Parent, ParentB{
  public static void main(String[] args) {
    Parent parent = new Child();
    parent.sayHello(); //output: Child says hello.
  }

  @Override
  public void sayHello() {
    Parent.super.sayHello(); // To avoid ambiguity due to
                             // multiple inheritance
    //Other ways
    //ParentB.super.sayHello()
    //or
    //System.out.print("Your own implementation")
  }
}
