package photoalbum.dodospringboot.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proId")
    private Integer proid;
    private String proname;
    private String procategory;
    private byte[] proimage;
    private Integer proprice;
    private Integer prostock;
    private String prodescription;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProcategory() {
        return procategory;
    }

    public void setProcategory(String procategory) {
        this.procategory = procategory;
    }

    public byte[] getProimage() {
        return proimage;
    }

    public void setProimage(byte[] proimage) {
        this.proimage = proimage;
    }

    public Integer getProprice() {
        return proprice;
    }

    public void setProprice(Integer proprice) {
        this.proprice = proprice;
    }

    public Integer getProstock() {
        return prostock;
    }

    public void setProstock(Integer prostock) {
        this.prostock = prostock;
    }

    public String getProdescription() {
        return prodescription;
    }

    public void setProdescription(String prodescription) {
        this.prodescription = prodescription;
    }
}