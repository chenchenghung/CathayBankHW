package tw.com.cathaybk.hw.dao;

import tw.com.cathaybk.hw.pojos.Coin;

import java.util.List;

public interface CoinDAO {

    public abstract Coin select(Integer id);

    public abstract List<Coin> select();

    public abstract Coin insert(Coin bean);

    public abstract Coin update(Coin bean);

    public abstract boolean delete(Integer id);

    public abstract List<Coin> lastInfo();
}
