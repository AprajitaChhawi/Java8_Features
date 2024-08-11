package Lambda_Expression;

import java.sql.SQLOutput;

public class LambdaMain {
    public static void main(String[] args) {
        Lambda l = ()-> "Software Engineer";
        System.out.println(l.getName());
    }
}
