import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class Calculator {

    void CalculatorNetto(Product product){


        BigDecimal lab = new BigDecimal("1");
        BigDecimal vat = lab.multiply(product.getVat());
        BigDecimal netto = product.getBrutto().subtract(product.getBrutto().multiply(changeVatFromPercentsToNumber(product)));
        product.setNetto(netto.divide(new BigDecimal("1"),2 ,RoundingMode.HALF_UP));
        }
        BigDecimal calculateBruttoSum(List<Product>products){

        BigDecimal sum = new BigDecimal(0);
             for(Product product:products)
                sum = sum.add(product.getBrutto());

        return sum;

            }
        BigDecimal calculateNettoSum(List<Product>products){
            BigDecimal sum = new BigDecimal(0);
              for(Product product:products) {
                  sum = sum.add(product.getNetto());
              }

        return sum;
       }
        BigDecimal calculateVatSum(List<Product>products){
        BigDecimal sum = new BigDecimal(0);
        for(Product product: products)
            sum = sum.add(changeVatFromPercentsToNumber(product).multiply(product.getNetto()));


        return sum.divide(new BigDecimal("1"),2,RoundingMode.HALF_UP);


        }
    private BigDecimal changeVatFromPercentsToNumber(Product product) {
        BigDecimal oneHundredth = new BigDecimal("0.01");
        return oneHundredth.multiply(product.getVat());
    }

}
