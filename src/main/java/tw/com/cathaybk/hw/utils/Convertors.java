package tw.com.cathaybk.hw.utils;

import tw.com.cathaybk.hw.pojos.Coin;
import tw.com.cathaybk.hw.pojos.Currency;
import tw.com.cathaybk.hw.pojos.MyCoin;

import java.time.OffsetDateTime;

public class Convertors {

    public static MyCoin myCoinConvertor(Coin coin){
        MyCoin myCoin = new MyCoin();
        myCoin.setCode(coin.getCode());
        myCoin.setZhcode(coin.getZhcode());
        myCoin.setRate(coin.getRate());

        return myCoin;
    }

    public static Coin exchangePopulator(Currency currency, OffsetDateTime updated) {
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

    public static String zhLang(String lang) {
        if ("USD".equals(lang)){
            return "美金";
        } else if ("GBP".equals(lang)) {
            return "英鎊";
        } else {
            return "歐元";
        }
    }
}
