package dao;

import base.BaseDao;
import dto.KullaniciYorumDetayDto;
import dto.YorumCountDto;
import dto.YorumDetayDto;
import entity.Urun;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {
    public List<YorumDetayDto> findCommentsForOne(){
    String sql = " select new dto.YorumDetayDto(urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, UrunYorum.yorum, UrunYorum.yorumTarihi) "
            + " from Urun urun " +
            " join UrunYorum urunyorum on urun.id = urunyorum.urun.id ";


        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public List<YorumCountDto> findNumberOfCommentToUrun(){
        String sql = "select new dto.YorumCountDto( urun.id, urun.adi, urun.fiyat, count(UrunYorum.yorum)) "
                +" from Urun urun join UrunYorum ury on urun.id = ury.urun.id " +
                "group by(urun.adi)";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }

    public List<KullaniciYorumDetayDto> findKullaniciComment(Long id){
        String sql = "select new dto.KullaniciYorumDetayDto( kullanici.id, kullanici.adi, urun.id, urunyorum.yorum, urunyorum.yorumTarihi) "
                + "from Kullanici kullanici" +
                "join UrunYorum urunyorum on kullanici.kullanici.id = urunyorum.kullanici.id" +
                "where kullanici.kullanici.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id",id);
        return  query.list();
    }
}
