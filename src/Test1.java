import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Test1 {
    public static void main(String[] args) throws IOException {

       Test0 test0 = new Test0();
       Calculator calculator = new Calculator();
       List<Product> products = new ArrayList<>();

       try {
           products = test0.readFromFile();
       }catch (FileNotFoundException e){
           System.err.println("Brak pliku");

       }
       for (Product product: products){
           calculator.calclateNettoSum(products);
           System.out.println("Product");

       }
        System.out.println("Brutto:" + calculator.calculateBruttoSum(products) );
        System.out.println("Netto:" + calculator.calclateNettoSum(products));
        System.out.println("Vat:" + calculator.calculateVatSum(products) + "%.");




    }
}
