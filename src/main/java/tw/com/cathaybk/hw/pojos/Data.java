package tw.com.cathaybk.hw.pojos;

import java.util.Map;

public class Data {
    public String time;

    public Map<String,MyCoin> bpi;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Map<String, MyCoin> getBpi() {
        return bpi;
    }

    public void setBpi(Map<String, MyCoin> bpi) {
        this.bpi = bpi;
    }
}
