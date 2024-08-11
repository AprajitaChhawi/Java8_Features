package org.example.functionalInterface;

@FunctionalInterface //When we use this annotation it tells compiler
                     //That the below interface is functional interface
                     //should contain only 1 abstract method
public interface MyInterface {
  public void sayHello(); //As long as there is a single abstract method it is
                          //A functional interface
  // public void sayBye(); //But since there is a new method by the name sayBye()
                           //It is no more a functional Interface
                            //Since we are having @functionalInterace annotation we
                            //Will not be able to declare sayBye();
  default void sayBye(){} //but can have default and static methods
  static void sayTata(){}

}
