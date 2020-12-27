package groupone.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String URL;

    @Column
    private String headline;

    @Column
    private String info;

    @Column
    private float price;

    @Column
    private Long amountInStock;

    public Long getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Long amountInStock) {
        this.amountInStock = amountInStock;
    }
}
