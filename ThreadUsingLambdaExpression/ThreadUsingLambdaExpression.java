package ThreadUsingLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThreadUsingLambdaExpression {
    public static void main(String[] args) {
        Runnable runnble = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("Hello " + i + " " + Thread.currentThread().getId());
        };
        Thread thread = new Thread(runnble);
        thread.run();
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(1);
        Comparator<Integer> c = (a1,b1) ->{
            return b1-a1;
        };
        System.out.println(a);
        Collections.sort(a,c);
        System.out.println(a);
    }
}
