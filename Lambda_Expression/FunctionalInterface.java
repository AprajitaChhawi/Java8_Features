package Lambda_Expression;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void sayHello();
    default void sayBye(){
        System.out.println("Bye");
    }
}
