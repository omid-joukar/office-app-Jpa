import javax.persistence.*;

/**
 * Created by KPS on 8/15/2020.
 */
@Entity
@Table(name = "products")
public class Products {
    private String productCode;
    private String productName;
    private Productlines productLines;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private String quantityInStock;
    private Double buyPrice;
    private Double MSRP;
    @Id
    @Column(name = "productCode")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @ManyToOne
    @JoinColumn(name = "productLine")
    public Productlines getProductLines() {
        return productLines;
    }

    public void setProductLines(Productlines productLines) {
        this.productLines = productLines;
    }
    @Column(name = "productScale")
    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }
    @Column(name = "productVendor")
    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }
    @Column(name = "productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    @Column(name = "quantityInStock")
    public String getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(String quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    @Column(name = "buyPrice")
    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }
    @Column(name = "MSRP")
    public Double getMSRP() {
        return MSRP;
    }

    public void setMSRP(Double MSRP) {
        this.MSRP = MSRP;
    }
}
