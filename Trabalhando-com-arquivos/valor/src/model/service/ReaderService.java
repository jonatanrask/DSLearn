package model.service;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderService {

    private List<Product> productList = new ArrayList<>();

    public ReaderService() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void readerLine(String pathReader, String pathWriter) throws IOException {
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
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathWriter))) {
                for (Product products : productList) {
                    bufferedWriter.write(products.getName() + "," + String.format("%.2f", products.subtotal()));
                    bufferedWriter.newLine();
                }
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
