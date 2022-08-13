package application;


import model.service.ReaderService;

import java.io.IOException;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String pathReader = "F:\\Estudos\\DSLearn\\Java-POO\\Trabalhando-com-arquivos\\valor\\sold\\items-sold.txt";
        String pathWriter = "F:\\Estudos\\DSLearn\\Java-POO\\Trabalhando-com-arquivos\\valor\\sold\\out\\summary.csv";

        ReaderService readerService = new ReaderService();

        try {
            readerService.readerLine(pathReader, pathWriter);

        } catch (IOException exception) {
            System.out.println("Error " + exception.getMessage());
        }
    }
}
