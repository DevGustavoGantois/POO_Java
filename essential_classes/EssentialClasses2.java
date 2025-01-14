package src.essential_classes;
import java.util.Scanner;

public class EssentialClasses2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println("Enter your age:");
        Integer age = scan.nextInt();

        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
    }
}

//O scanner serve para ouvir uma entrada de dados.