package application;
/*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.
 */
import model.service.WriterService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String directory = sc.nextLine();
        String pathReader = directory + "items-sold.csv";
        String pathWriter =  directory + "out\\summary.csv";

        WriterService writerService = new WriterService();
        writerService.writerLine(pathWriter, pathReader);
    }
}
