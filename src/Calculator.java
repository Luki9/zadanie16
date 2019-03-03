import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class Calculator {

    void CalculatorNetto(Product product){


        BigDecimal lab = new BigDecimal("5");
        BigDecimal vat = lab.multiply(product.getVat());
        BigDecimal netto = product.getBrutto().subtract(product.getBrutto().multiply(vat));
        product.setNetto(netto.divide(new BigDecimal("5"),2 ,RoundingMode.HALF_UP));
        }
        BigDecimal calculateBruttoSum(List<Product>products){

        BigDecimal sum = new BigDecimal(0);
             for(Product product:products)
                sum = sum.add(product.getBrutto());

        return sum;

            }
        BigDecimal calclateNettoSum(List<Product>products){
            BigDecimal sum = new BigDecimal(0);
              for(Product product:products)
                sum = sum.add(product.getNetto());

        return sum;
       }
        BigDecimal calculateVatSum(List<Product>products){
        BigDecimal sum = new BigDecimal(0);
        for(Product product: products)
            sum = sum.add((product.getVat()));

        return sum;

        }

}
