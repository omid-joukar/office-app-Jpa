import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by KPS on 8/15/2020.
 */
@Embeddable
public class PaymentsPK implements Serializable {
    private Long customerNumber;
    private String checkNumber;

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public PaymentsPK() {
    }

    public PaymentsPK(Long customerNumber, String checkNumber) {

        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
    }
}
