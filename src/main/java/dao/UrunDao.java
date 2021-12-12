package dao;

import antlr.collections.impl.LList;
import base.BaseDao;
import dto.UrunDetayDto;
import entity.Urun;

import org.hibernate.Session;

import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class UrunDao extends BaseDao {

    public List<Urun> findAll(){


        Query query = getCurrentSession().createQuery("select urun from Urun urun");

        return query.list();
    }

    public Urun findById(Long id){
        String sql = "select urun from Urun urun where urun.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId",id);

        return (Urun) query.uniqueResult();
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe){
        String sql = "select urun from Urun urun where 1=1";

        if(fiyatGe!= null){
            sql = sql + " and urun.fiyat >= :fiyatGe ";
        }

        if(fiyatLe !=null){
            sql = sql + " and urun.fiyat <= :fiyatLe ";

        }
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatGe",fiyatGe);
        query.setParameter("fiyatLe",fiyatLe);

        return query.list();
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe,BigDecimal fiyatLe){
        String sql = "select urun from Urun urun where 1=1";

        if(fiyatGe !=null && fiyatLe !=null){
            sql = sql + " and urun.fiyat between :fiyatGe and :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatGe",fiyatGe);
        query.setParameter("fiyatLe",fiyatLe);

        return query.list();
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim){
        String sql ="select urun from Urun urun left join Kategori kategori on urun.kategori.id = kategori.id " +
                "where kategori.kirilim = :kirilim";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim",kirilim);

        return query.list();
    }

    public List<UrunDetayDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim){
        String sql = "select new dto.UrunDetayDto( urun.adi, kategori.adi, urun.fiyat) "
            + " from Urun urun " +
               " left join Kategori kategori on urun.kategori.id =kategori.id " +
               " where kategori.kirilim = :kirilim";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim",kirilim);
        return query.list();
    }
}
