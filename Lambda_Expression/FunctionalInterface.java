package Lambda_Expression;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void sayHello();
    default void sayBye(){
        System.out.println("Bye");
    }
    public static void sayHello2(){
        System.out.println("saying Bye again");
    }
}
