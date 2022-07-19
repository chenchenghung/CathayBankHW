package tw.com.cathaybk.hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.cathaybk.hw.pojos.Coin;
import tw.com.cathaybk.hw.pojos.Data;
import tw.com.cathaybk.hw.pojos.MyCoin;
import tw.com.cathaybk.hw.service.CoinService;
import tw.com.cathaybk.hw.utils.Convertors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path ={"/v2/bpi"})
public class ApiController {
    @Autowired
    private CoinService coinService;

    @GetMapping( path = {"/coin"},produces = {"application/json;charset=UTF-8"})
    public ResponseEntity<Data> findData() {
//		成功：200 (OK)
        List<Coin> coins = coinService.lastInfo();
        Data data = new Data();
        Map<String,MyCoin> bpi=new HashMap<>();
        for(Coin coin : coins){
            MyCoin myCoin = Convertors.myCoinConvertor(coin);
            bpi.put(myCoin.getCode(),myCoin);
        }
        data.setTime(coins.get(0).getUpdated().toString());
        data.setBpi(bpi);
        return ResponseEntity.ok().body(data);
    }

}
