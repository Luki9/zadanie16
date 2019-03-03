import java.math.BigDecimal;
import java.util.Objects;

class Product {

    private String name;
    private BigDecimal netto;
    private BigDecimal brutto;
    private BigDecimal vat;

    public Product(String s, BigDecimal bigDecimal, BigDecimal bigDecimal1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public void setBrutto(BigDecimal brutto) {
        this.brutto = brutto;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public Product(String name, BigDecimal netto, BigDecimal brutto, BigDecimal vat) {
        this.name = name;
        this.netto = netto;
        this.brutto = brutto;
        this.vat = vat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(netto, product.netto) &&
                Objects.equals(brutto, product.brutto) &&
                Objects.equals(vat, product.vat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, netto, brutto, vat);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", netto=" + netto +
                ", brutto=" + brutto +
                ", vat=" + vat +
                '}';
    }
}
