package tw.com.cathaybk.hw.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "COIN")
public class Coin implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "code")
    public String code;

    @Column(name = "zhcode")
    public String zhcode;

    @Column(name = "symbol")
    public String symbol;

    @Column(name = "rate")
    public String rate;

    @Column(name = "description")
    public String description;

    @Column(name = "ratefloat")
    public Double ratefloat;

    @Column(name = "updated")
    public OffsetDateTime updated;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZhcode() {
        return zhcode;
    }

    public void setZhcode(String zhcode) {
        this.zhcode = zhcode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRatefloat() {
        return ratefloat;
    }

    public void setRatefloat(Double ratefloat) {
        this.ratefloat = ratefloat;
    }

    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", zhcode='" + zhcode + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", ratefloat=" + ratefloat +
                ", updated=" + updated +
                '}';
    }
}
