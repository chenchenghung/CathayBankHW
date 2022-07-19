package tw.com.cathaybk.hw.pojos;

import java.io.Serializable;

public class Currency implements Serializable {
    public String code;
    public String symbol;
    public String rate;
    public String description;
    public Double ratefloat;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
}
