package src;

import java.lang.System;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaFileIO2 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            //Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
            byte[] bytesArq = Files.readAllBytes(path);

            String content_two = Files.readString(path);
            java.lang.System.out.println(content_two);
            Files.write(path, content_two.getBytes(StandardCharsets.UTF_8));

            List<String> names = new ArrayList<>();
            names.add("Gustavo");
            names.add("Augusto");

            StringBuilder content_two = new StringBuilder();
            names.forEach(n ->content_two.append(n + "\n"));
            Files.write(path, content_two.toString().getBytes(StandardCharsets.UTF_8))

            //Como são bytes podemos criar uma String a partir de agora
            String content = new String(bytesArq);
            System.out.println(content);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
