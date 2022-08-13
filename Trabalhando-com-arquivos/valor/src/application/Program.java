package application;

import model.service.WriterService;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String pathReader = "F:\\Estudos\\DSLearn\\Java-POO\\Trabalhando-com-arquivos\\valor\\sold\\items-sold.csv";
        String pathWriter = "F:\\Estudos\\DSLearn\\Java-POO\\Trabalhando-com-arquivos\\valor\\sold\\out\\summary.csv";

        WriterService writerService = new WriterService();
        writerService.writerLine(pathWriter, pathReader);
    }
}
