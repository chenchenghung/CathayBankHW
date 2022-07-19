package tw.com.cathaybk.hw.pojos;

import java.time.OffsetDateTime;

public class MyCoin {

    public String code;

    public String zhcode;

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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String rate;

}
