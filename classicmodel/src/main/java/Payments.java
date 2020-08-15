import javax.persistence.*;
import java.util.Date;

/**
 * Created by KPS on 8/15/2020.
 */
@Table
@Entity(name = "payments")
@IdClass(PaymentsPK.class)
public class Payments {
    private Long customerNumber;
    private String checkNumber;
    private Date paymentDate;
    private Double amount;
    @Id
    @Column(name = "customerNumber")
    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }
    @Id
    @Column(name = "checkNumber")
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
    @Column(name = "paymentDate")
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
