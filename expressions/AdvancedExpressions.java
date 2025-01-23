package src.expressions;

public class AdvancedExpressions {
    public static void main(String[] args) {
        String name = "Gustavo Gantois Caria Carvalho";
        Integer age = 21;
        Double salary = 3000.00;

        String funcData = String.format("Age: %05d Name: %-15s Sal.: %,.2f", age, salary, name);
        System.out.println(funcData);
    }
}
