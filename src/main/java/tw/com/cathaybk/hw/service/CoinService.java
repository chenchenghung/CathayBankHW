package tw.com.cathaybk.hw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.cathaybk.hw.dao.CoinDAO;
import tw.com.cathaybk.hw.pojos.Coin;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CoinService {
    @Autowired
    private CoinDAO coinDAO;

    @Transactional(readOnly = true)
    public List<Coin> select(Coin bean){
        List<Coin> result=null;
        if(bean!=null && bean.getId()!=null && !bean.getId().equals(0)){
            Coin temp = coinDAO.select(bean.getId());
            if(temp!=null){
                result = new ArrayList<Coin>();
                result.add(temp);
            }else {
                result= coinDAO.select();
            }
        }
        return result;
    }

    public Coin insert(Coin bean){
        Coin result=null;
        if(bean!=null){
            result= coinDAO.insert(bean);
        }
        return result;
    }

    public Coin update(Coin bean){
        Coin result=null;
        if(bean!=null && bean.getId()!=null){
            result= coinDAO.update(bean);
        }

        return result;
    }

    public boolean delete(Coin bean){
        boolean result= false;
        if(bean!=null && bean.getId()!=null){
            result = coinDAO.delete(bean.getId());
        }
        return result;
    }

    public List<Coin> lastInfo(){
        return coinDAO.lastInfo();
    }

}
