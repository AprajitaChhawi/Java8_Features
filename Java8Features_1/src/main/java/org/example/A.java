package org.example;

public class A implements C, B{

  @Override
  public int add() {
    System.out.println("?");
    return 1;
  }

 Runnable runnable = new Runnable() {
   @Override
   public void run() {

   }
 };


  public static void main(String args[]) {
    A a = new A();
    B b = new A();
    C c = new A();
    a.add();
    b.add();
    c.add();
  }
}
