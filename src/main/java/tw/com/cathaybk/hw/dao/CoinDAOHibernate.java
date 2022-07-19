package tw.com.cathaybk.hw.dao;

import net.bytebuddy.asm.Advice;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import tw.com.cathaybk.hw.pojos.Coin;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public class CoinDAOHibernate implements CoinDAO{
    @PersistenceContext
    private Session session;

    public Session getSession(){
        return session;
    }

    @Override
    public Coin select(Integer id) {
        if(id!=null){
            return this.getSession().get(Coin.class,id);
        }
        return null;
    }

    @Override
    public List<Coin> select() {
        return this.getSession().createQuery("From Coin",Coin.class).list();
    }

    @Override
    public Coin insert(Coin bean) {
        if(bean!=null){
            Integer pk= (Integer) this.getSession().save(bean);
            Coin result = this.getSession().get(Coin.class, pk);

            return result;
        }
        return null;
    }

    @Override
    public Coin update(Coin bean) {
        if(bean!=null && bean.getId()!=null){
            Coin temp = this.getSession().get(Coin.class, bean.getId());
            if(temp!=null){
                return (Coin) this.getSession().merge(bean);
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if(id!=null){
            Coin temp = this.getSession().get(Coin.class, id);
            if(temp!=null){
                this.getSession().delete(temp);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Coin> lastInfo() {
        return this.getSession().createQuery("from Coin where updated = ( SELECT max(updated) from Coin)").list();
    }
}
