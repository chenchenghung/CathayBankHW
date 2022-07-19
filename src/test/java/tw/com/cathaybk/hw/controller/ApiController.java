package tw.com.cathaybk.hw.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tw.com.cathaybk.hw.pojos.Coin;
import tw.com.cathaybk.hw.pojos.Data;
import tw.com.cathaybk.hw.pojos.MyCoin;
import tw.com.cathaybk.hw.service.CoinService;
import tw.com.cathaybk.hw.utils.Convertors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
public class ApiController {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CoinService coinService;
    @Test
    public void findData(){

        List<Coin> coins = coinService.lastInfo();
        Data data = new Data();
        Map<String, MyCoin> bpi=new HashMap<>();
        for(Coin coin : coins){
            MyCoin myCoin = Convertors.myCoinConvertor(coin);
            bpi.put(myCoin.getCode(),myCoin);
        }
        data.setTime(coins.get(0).getUpdated().toString());
        data.setBpi(bpi);
        System.out.println(data.getBpi().toString());
        System.out.println(data.getTime().toString());

    }
}
