import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by KPS on 8/15/2020.
 */
@Entity
@Table(name = "productlines")
public class Productlines {
    private String productLine;
    private String textDescription;
    private String htmlDescription;
    private Blob image;
    @Id
    @Column(name = "productLine")
    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }
    @Column(name = "textDescription")
    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }
    @Column(name = "htmlDescription")
    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }
    @Lob
    @Nationalized
    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

}
