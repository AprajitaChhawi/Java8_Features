package Lambda_Expression;

public class LambdaMain2 {
    public static void main(String[] args) {
        Lambda2 s = (a,b) -> {
            int x=10;
            System.out.println(x);
            return a+b;
        };
        System.out.println(s.add(2,3));
    }
}
