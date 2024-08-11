package org.example.inheritance_in_FI;

@FunctionalInterface //If parent is a functional interface then the child have to be the same
public interface Child extends Parent{
//  public void sayBye(); Cannot declare one more method
  public void sayHello(); //Although can declare a method with same name
  default void sayBye(){}
  static void sayNamaste(){} //Default and static methods can come
}
