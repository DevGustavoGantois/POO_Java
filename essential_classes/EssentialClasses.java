package src.essential_classes;

public class EssentialClasses {
    public static void main(String[] args) {
        //Trabalhando exceção
        try{
            System.out.println("Dividing 1/0");
            System.out.println(1/0);
        } catch (Exception ex) {
            System.err.print("There was an error in the division attempt.");
        }
    }
}
