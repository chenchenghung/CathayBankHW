package tw.com.cathaybk.hw.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tw.com.cathaybk.hw.pojos.Bpi;
import tw.com.cathaybk.hw.pojos.Coin;
import tw.com.cathaybk.hw.service.CoinService;

import java.util.List;
import java.util.stream.Collectors;

import static tw.com.cathaybk.hw.utils.Convertors.exchangePopulator;

@Component
public class ScheduleTasks {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CoinService coinService;

    @Scheduled(fixedRate = 600000)
    public void renewBpi(){
        String url= "https://api.coindesk.com/v1/bpi/currentprice.json";
        Bpi bpi = restTemplate.getForObject(url, Bpi.class);
        List<Coin> collect = bpi.getBpi().entrySet().stream().map(data -> exchangePopulator(data.getValue(), bpi.getTime().updatedISO))
                .collect(Collectors.toList());
        for(Coin coin : collect){
            Coin insert = coinService.insert(coin);
            System.out.println(insert);
        }
    }
}
