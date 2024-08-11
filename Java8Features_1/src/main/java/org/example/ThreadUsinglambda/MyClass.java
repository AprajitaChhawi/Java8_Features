package org.example.ThreadUsinglambda;


//Here we will be seeing use of a special
//functional interface called Runnable FI.
public class MyClass implements Runnable{
  @Override
  public void run() {
    for (int i = 1; i<=10; i++) {
      System.out.println("Hello");
    }
  }
}
