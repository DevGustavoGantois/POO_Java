package src.comparision;

public class ComparisionApp2 {
    public static void main(String[] args) {
        String string = "Gustavo";
        String string1 = new String("Gustavo");

        System.out.println(string1 == string);
        System.out.println(string1.equals(string));
    }
}

//Como este objeto já está na memoria ele será comparado sem problemas, porém se usarmos new String() as coisas mudam.
//Agora eu tenho 2 objetos gustavo através desse new String("Gustavo"), definido como um padrão necessitação de explicidade de ter 2 objetos.