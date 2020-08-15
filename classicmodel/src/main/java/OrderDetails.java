import javax.persistence.*;

/**
 * Created by KPS on 8/15/2020.
 */
@Entity
@Table(name = "orderdetails")
@IdClass(OrderDetailsPK.class)
public class OrderDetails {
    private Double orderNumber;
    private String productCode;
    private Double quantityOrdered;
    private Double priceEach;
    private Long orderLineNumber;
    @Id
    @Column(name = "orderNumber")
    public Double getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Double orderNumber) {
        this.orderNumber = orderNumber;
    }
    @Id
    @Column(name = "productCode")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    @Column(name = "quantityOrdered")
    public Double getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
    @Column(name = "priceEach")
    public Double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Double priceEach) {
        this.priceEach = priceEach;
    }
    @Column(name = "orderLineNumber")
    public Long getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(Long orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }
}
