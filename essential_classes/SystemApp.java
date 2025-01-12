package src.essential_classes;

public class SystemApp {
    public static void main(String[] args) {
        String name = "Gustavo";
        int age = 21;
        double weight = 80.0;
        double income = 3234.56;

        //Name: Gustavo age: 21 weight: 80.0 income: R$ 3234.56


        System.out.println("Name: %s Age: %d weight: %.2f Income: R$ %,.2f", name, age, weight , income);
    }
}
