package src;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File directory = new File("c:\\rocket");
        System.out.println("directory exist?" + directory.exists());
        if(!directory.exists()) {
            directory.mkdir();
            System.out.println("Create directory");

            File arq = new File("c:\\rockets\\aula-java.txt");
            System.out.println(arq.exists());
            arq.createNewFile();
            System.out.println(arq.exists());

            try {
                File arq = new FIle("c\\rockets\\aula-java.txt");
                arq.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
}

