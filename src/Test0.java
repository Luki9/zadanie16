import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test0 {

    List<Product> readFromFile() throws FileNotFoundException{

        File file = new File("dane.csv");
        Scanner scanner = new Scanner(file);
        String product;
        List<Product> products = new ArrayList<>();


        while (scanner.hasNextLine()){
            product = scanner.nextLine();
            String[] product1 = product.split(";");

            try {
                products.add(new Product(product1[0], new BigDecimal(product1[1]), new BigDecimal(product1[2])));
            }catch (NumberFormatException e){
                System.err.println("Błędne dane");

            }
        }
        return products;
    }
}
