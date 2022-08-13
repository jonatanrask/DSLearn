package model.service;

import model.entities.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterService {
    public WriterService(){
    }
    public void writerLine(String pathWriter, String pathReader) {
        ReaderService readerService = new ReaderService();
        readerService.readerLine(pathReader);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathWriter))) {
            for(Product product : readerService.getProductList()){
                bufferedWriter.write(product.getName() + "," + String.format("%.2f", product.subtotal()));
                bufferedWriter.newLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
