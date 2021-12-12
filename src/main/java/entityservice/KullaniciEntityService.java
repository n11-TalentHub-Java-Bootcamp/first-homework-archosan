package entityservice;

import dao.KullaniciDao;
import entity.Kullanici;

import java.util.List;

public class KullaniciEntityService {
    private KullaniciDao kullaniciDao;

    public KullaniciEntityService(){
        kullaniciDao = new KullaniciDao();
    }

    public List<Kullanici> findAll(){
        return  kullaniciDao.findAll();
    }
}
