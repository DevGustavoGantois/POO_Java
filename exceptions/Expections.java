package src.exceptions;

public class Expections {
    public static void main(String[] args) {
        try {
            Double value = (double) (100 / 3);
            System.out.println(value);

        } catch (Expection ex) {
            System.out.println("error");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }
    }
}
