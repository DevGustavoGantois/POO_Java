package src.essential_classes;

public class EssentialClasses4 {
    public static void main(String[] args) {
        String name = "Gustavo";
        name = name.concat("Gantois");
        name = name.concat("I´m software developer.");

        //Quando você ver a necessidade de realizar concatenações constantes aos inves de fazer da forma acima, você utliza a stringBuilder como mostrado abaixo:

        StringBuilder sb = new StringBuilder();
        sb.append("Gustavo");
        sb.append("Gantois");
    }
}
