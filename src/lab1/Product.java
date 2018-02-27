/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ektasharma
 */
public class Product {

    private String productCode;
    private String productName;
    private String description;
    private double productPrice;
    private int quantityOnHand;

    public Product() {
    }

    public Product(String productCode, String productName, String description, double productPrice, int quantityOnHand){
        setProductCode(productCode);
        setProductName(productName);
        setDescription(description);
        setProductPrice(productPrice);
        setQuantityOnHand(quantityOnHand);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) throws NullPointerException {
        if (productCode==(null) || productCode.equals("")) {
            throw new NullPointerException("Product code is null");
        } else {
            this.productCode = productCode;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) throws NullPointerException {
        if (productName.equals(null) || productName.equals("")) {
            throw new NullPointerException("Product name is null");
        } else {
            this.productName = productName;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) throws ArithmeticException {
        if (productPrice == 0) {
            throw new ArithmeticException("Product price is zero ");
        } else if (productPrice < 0) {
            throw new ArithmeticException("Product price is less than zero ");
        } else {
            this.productPrice = productPrice;
        }

    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) throws ArithmeticException {
        if (quantityOnHand < 0) {
            throw new ArithmeticException("Quantity on hand is negative ");
        } else {
            this.quantityOnHand = quantityOnHand;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "productCode=" + productCode + ", productName=" + productName + ", "
                + "description=" + description + ", productPrice=" + productPrice + ", quantityOnHand=" + quantityOnHand + '}';
    }

}
