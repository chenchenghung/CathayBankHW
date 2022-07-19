package tw.com.cathaybk.hw.pojos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;
import tw.com.cathaybk.hw.utils.MyApplicationJavascriptHttpMessageConverter;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@PropertySource(value = "classpath:application.yml")
@SpringBootTest
public class BpiTest {
//    https://api.coindesk.com/v1/bpi/currentprice.json
    @Test
    void contextLoads() {
    }
//    @Autowired
//    private RestTemplate restTemplate;
    @Test
    public void getData()  {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MyApplicationJavascriptHttpMessageConverter());
        String url= "https://api.coindesk.com/v1/bpi/currentprice.json";
        Bpi bpi = restTemplate.getForObject(url, Bpi.class);
        List<Coin> collect = bpi.getBpi().entrySet().stream().map(data -> exchangePopulator(data.getValue(), bpi.getTime().updatedISO))
                .collect(Collectors.toList());

    }


    public Coin exchangePopulator(Currency currency, OffsetDateTime updated) {
        Coin Coin = new Coin();
        Coin.setCode(currency.getCode());
        Coin.setZhcode(zhLang(currency.getCode()));
        Coin.setDescription(currency.getDescription());
        Coin.setSymbol(currency.getSymbol());
        Coin.setRate(currency.getRate());
        Coin.setRatefloat(currency.getRatefloat());
        Coin.setUpdated(updated);
        return Coin;
    }

    public String zhLang(String lang) {
        if ("USD".equals(lang)){
            return "美金";
        } else if ("GBP".equals(lang)) {
            return "英鎊";
        } else {
            return "歐元";
        }
    }
}
