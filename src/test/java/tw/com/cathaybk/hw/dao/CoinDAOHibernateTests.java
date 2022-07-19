package tw.com.cathaybk.hw.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import tw.com.cathaybk.hw.pojos.Coin;

import java.time.OffsetDateTime;
import java.util.List;

@PropertySource(value = "classpath:application.yml")
@SpringBootTest
public class CoinDAOHibernateTests {
    @Test
    void contextLoads() {
    }
    @Autowired
    private CoinDAO coinDAO;

    @Test
    @Transactional
    public void selectTest(){
        Coin select = coinDAO.select(1);
        System.out.println("Coin1 "+select);
    }

//    @Test
//    @Transactional
//    @Rollback(value = false)
//    public void insertTest(){
//        Coin bean = new Coin();
//        bean.setZhcode("英鎊");
//        bean.setCode("GBP");
//        bean.setSymbol("&pound;");
//        bean.setRate("17,307.169");
//        bean.setDescription("British Pound Sterling");
//        bean.setRatefloat(17307.3169);
//        bean.setUpdated(OffsetDateTime.now());
//        Coin insert = coinDAO.insert(bean);
//        System.out.println(insert);
//    }
//    @Test
//    @Transactional
//    @Rollback(value = false)
//    public void updateTest(){
//        Coin select = coinDAO.select(1);
//        select.setZhcode("美元");
//        System.out.println(select);
//    }

//    @Test
//    @Transactional
//    @Rollback(value = false)
//    public void deleteTest(){
//        Coin select = coinDAO.select(3);
//        System.out.println(select);
//        boolean delete = coinDAO.delete(3);
//        System.out.println(delete);
//    }

    @Test
    @Transactional
    public void lastInfoTests(){
        List<Coin> infos = coinDAO.lastInfo();
        System.out.println("Coin1 "+infos);
    }
}
