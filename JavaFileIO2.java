package src;

import java.lang.System;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileIO2 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            //Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
            byte[] bytesArq = Files.readAllBytes(path);

            String content_two = Files.readString(path);
            java.lang.System.out.println(content_two);

            //Como são bytes podemos criar uma String a partir de agora
            String content = new String(bytesArq);
            System.out.println(content);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
