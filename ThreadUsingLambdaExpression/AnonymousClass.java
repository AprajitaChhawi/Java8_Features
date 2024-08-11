package ThreadUsingLambdaExpression;

public class AnonymousClass {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            int x = 10;
            @Override
            public String getSalary() {
                System.out.println(this.x);
                return "100";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };
        System.out.println(employee.getDesignation());
        System.out.println(employee.getSalary());
    }
}
