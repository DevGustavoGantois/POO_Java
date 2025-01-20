package src;

import java.lang.System;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegisterSystem {
    public static void main(String[] args) {

        List<Register> registers = new ArrayList<>();
        registers.add(new Register("Gustavo Gantos Caria Carvalho", "M", 7199588246, LocalDate.of(2003, 9, 29),  false));
        registers.add(new Register("Augusto de Oliveira 1234", "M", 72311313213,LocalDate.of(2003, 9, 29)), false);
        registers.add(new Register("Alguma coisa 1234", "F", 8312763212,LocalDate.of(2003, 9, 29)), false);

        writeLimitLayout(registers);
        writePositionalLayout(registers);
        writeLimitLayout();

    }

    public static void writeLimitLayout(List<Register> registers) {
        java.lang.System.out.println("***** - LIMIT LAYOUT - ****");

        try {
            StringBuilder content = new StringBuilder();

            for (Register register : registers) {
                content.append(register.getName() + ";");
                content.append(register.getSex() + ";");
                content.append(register.getPhone() + ";");
                content.append(register.getBornDate() + ";");
                content.append(register.getSugestValue() + ";");
                content.append(register.isClient() + ";");
                content.append(java.lang.System.lineSeparator());
            };

            java.lang.System.out.println(content.toString());

            Path destinyArq = Paths.get("C:\\arquivos\\rocket\\lista-contatos-modelo-delimitado.csv");
            Files.write(destinyArq, content.toString().getBytes(StandardCharsets.UTF_8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.lang.System.out.println("The end....");
    }

    public static List<Register> writeLimitLayout() {
        List<Register> registers = new ArrayList<>();

        try {
            Path originArq = Paths.get("C:\\arquivos\\rocket\\lista-contatos-modelo-delimitado.csv");

            List<String> lines = Files.readAllLines(originArq);
            //Imprimindo cada linha obtida no arquivo
            for (String line : lines) {
                String[] columns = line.split("\\;"); //-> quebra uma linha em colunas com base
                String name = columns[0];
                String sex = columns[1];
                Long phone = Long.valueOf(columns[2]);
                LocalDate bornDate = LocalDate.parse(columns[3]);
                Double sugestValue = Double.valueOf(columns[4]);
                boolean client = Boolean.valueOf(columns[5]);

                registers.add(new Register(name, sex, phone, bornDate, sugestValue, client));
            };
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return registers;
    }

    public static void writePositionalLayout(List<Register> registers) {
        java.lang.System.out.println("**** - POSITION LAYOUT - ****");

        System.out.println("The end...");
    }
}
