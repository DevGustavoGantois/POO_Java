package src.expressions;

public class SimpleExpressions {
    public static void main(String[] args) {
        String name = "Gustavo";
        String surname = "Gantois";
        Integer register = 123;
        Double salary = 2245.83;
        String text = "Hi ".concat(name).concat("").concat(surname);

        String text_two = String.format("Hi %s %s", name, surname);
        // s, d, f, t
        System.out.println(text);
        System.out.println(text_two);

        String funcData = String.format("Register: ¨%05d - Name: %-15s - Salary: %,.2f", name, register, salary);
        System.out.println(funcData);
    }
}
