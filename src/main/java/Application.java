import dao.KategoriDao;
import entity.Kategori;
import entity.Kullanici;
import entity.UrunYorum;
import entityservice.KategoriEntityService;
import entityservice.KullaniciEntityService;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        /*
        KategoriEntityService service = new KategoriEntityService();
        List<Kategori> kategoriList = service.findAll();

        for(Kategori kategori : kategoriList){
            System.out.println(kategori.getAdi());
        }

         */
        //urun yorum application oluşturulmadı
        /*
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorum> kşst = service.findAll();
        */

        //kullanici application oluşturulmadı
        KullaniciEntityService service = new KullaniciEntityService();
        List<Kullanici> ksdjf  = service.findAll();
    }
}
