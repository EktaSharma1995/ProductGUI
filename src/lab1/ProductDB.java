/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ektasharma
 */
public class ProductDB {

    private static String fileName = "productFile.txt";

    private static ArrayList<Product> productList = new ArrayList<Product>();

    public static void writeToFile(Product p) throws java.io.IOException {

        File file = new File(fileName);

        try {
            java.io.PrintWriter output = new java.io.PrintWriter(new FileWriter((file), true));
            output.println(p.getProductCode());
            output.println(p.getProductName());
            output.println(p.getDescription());
            output.println(p.getProductPrice());
            output.println(p.getQuantityOnHand());

            output.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Product> getProducts() throws Exception {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        productList = new ArrayList<Product>();

        // Read data from a file
        while (input.hasNext()) {
            Product p = new Product();
            String productCode = input.nextLine();
            String productName = input.nextLine();
            String description = input.nextLine();
            double productPrice = Double.parseDouble(input.nextLine());
            int quantityOnHand = Integer.parseInt(input.nextLine());

            p.setProductCode(productCode);
            p.setProductName(productName);
            p.setDescription(description);
            p.setProductPrice(productPrice);
            p.setQuantityOnHand(quantityOnHand);

            productList.add(p);
//            input.close();
        }
        input.close();

        return productList;
    }
}
