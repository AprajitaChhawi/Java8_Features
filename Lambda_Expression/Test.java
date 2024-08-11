package Lambda_Expression;

import Lambda_Expression.ChildInterface;

class Test implements ChildInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayBye() {
        System.out.println("Child says Hello");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.sayBye();
        t.sayHello();
    }
}