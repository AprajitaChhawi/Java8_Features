package org.example.ThreadUsinglambda;

public class MyTestClass {
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    Runnable runnable = ()->{
      for (int i = 1; i<=10; i++) System.out.println("Lambda Hello.");
    };
    Thread childThread = new Thread(runnable);
    //we can give implementation of runnable interface to the thread class as a parameter.
    childThread.run();
  }
}
