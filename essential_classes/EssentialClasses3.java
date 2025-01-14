package src.essential_classes;

import java.util.Scanner;

public class EssentialClasses3 {
    public static void main(String[] args) {
       String name = null;
       Integer age = null;
       Double weight = null;

       //Simulando uma linha em um arquivo txt
        String stringLineFile = "Gustavo Gantois;80;1.73";
        Scanner scan = new Scanner(stringLineFile);
        scan.useDelimiter("\\|");
        //Conhecendo novos recursos
        int index = 0;
        while(scan.hasNext()) { //Olhe o conceito de controle de repetição sendo aplicado.
            if(index == 0) {
                name = scan.next();
            } else if (index == 1) {
                age = Integer.valueOf(scan.next());
            } else {
                weight = Double.valueOf(scan.next());
            }
            index++;
        }
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
        System.out.println("Your weight is:" + weight);
    }
}

//A classe scanner serve para