package src.enums;

public class EnumerationSystem {
    public static void main(String[] args) {
        String nameString = "SP";
        BrazilianState sb = BrazilianState.valueOf(nameString); //Podemos usar um toUpperCase() para dar um match nas opções.
        System.out.println(sb.getName());
        System.out.println(sb.name());
        System.out.println(sb.getAcronym());
    }
}
