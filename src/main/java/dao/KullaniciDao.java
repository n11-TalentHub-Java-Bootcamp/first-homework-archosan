package dao;

import base.BaseDao;
import entity.Kullanici;
import entity.Urun;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll(){


        Query query = getCurrentSession().createQuery("select kullanici from Kullanici kullanici");

        return query.list();
    }
}
