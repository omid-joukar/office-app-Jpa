import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by KPS on 8/15/2020.
 */
@Embeddable
public class OrderDetailsPK implements Serializable {
    private Double orderNumber;
    private String productCode;

    public Double getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Double orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public OrderDetailsPK() {
    }

    public OrderDetailsPK(Double orderNumber, String productCode) {

        this.orderNumber = orderNumber;
        this.productCode = productCode;
    }
}
