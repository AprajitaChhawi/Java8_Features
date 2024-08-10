package Lambda_Expression;

interface A{
    public void hello();

}

interface B{
    public void hello();

}

public class Myclass implements A,B,FunctionalInterface,OneMoreInterface{
    @Override
    public void sayHello() {
        System.out.println("sayHello");
    }

    @Override
    public void sayBye() {
        //OneMoreInterface.super.sayBye(); --> if we want to use oneMoreInterface default method
        //System.out.println("Hello from me"); --> if we want to use overridden default method
        FunctionalInterface.super.sayBye(); //--> if we want to use FunctionalInterface default method
    }

    //the class will only have to provide one implementation of common method
    @Override
    public void hello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Myclass c = new Myclass();
        c.hello();
        ((A) c).hello();
        ((B) c).hello();
        c.sayBye();
        c.sayHello();
    }

}
