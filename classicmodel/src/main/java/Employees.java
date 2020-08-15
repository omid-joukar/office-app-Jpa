import javax.persistence.*;

/**
 * Created by KPS on 8/15/2020.
 */
@Entity
@Table(name="employees")
public class Employees {
    private Long employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private Offices offices;
    private Employees reportsTo;
    private String jobTitle;
    @Id
    @Column(name = "employeeNumber")
    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @ManyToOne
    @JoinColumn(name = "officeCode")
    public Offices getOffices() {
        return offices;
    }

    public void setOffices(Offices offices) {
        this.offices = offices;
    }
    @ManyToOne
    @JoinColumn(name = "reportsTo")
    public Employees getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employees reportsTo) {
        this.reportsTo = reportsTo;
    }
    @Column(name = "jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
