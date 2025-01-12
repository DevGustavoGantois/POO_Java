package src.comparision;

public class ComparisionApp {
    public static void main(String[] args) {
        //stack vs heap
        int i1 = 128;
        int i2 = Integer.parseInt("128");

        System.out.println(i1.equals(i2));
    }
}

//== compara objetos, equals compara compara se as coisas são identicas independente.
