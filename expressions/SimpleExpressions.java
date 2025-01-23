package src.expressions;

public class SimpleExpressions {
    public static void main(String[] args) {
        String name = "Gustavo";
        String surname = "Gantois";
        String text = "Hi ".concat(name).concat("").concat(surname);

        System.out.println(text);
    }
}
