package model.service;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderService {

    private List<Product> productList = new ArrayList<>();

    public ReaderService() {
    }
    public void readerLine(String pathReader){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathReader))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] products = line.split(",");
                String name = products[0];
                double price = Double.parseDouble(products[1]);
                int quantity = Integer.parseInt(products[2]);
                Product product = new Product(name, price, quantity);
                productList.add(product);
                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
    public List<Product> getProductList() {
        return productList;
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
}
