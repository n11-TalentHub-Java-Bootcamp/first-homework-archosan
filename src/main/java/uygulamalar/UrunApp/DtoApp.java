package uygulamalar.UrunApp;

import dto.UrunDetayDto;
import entityservice.UrunEntityService;

import java.util.List;

public class DtoApp {
    public static void main(String[] args) {
        UrunEntityService service = new UrunEntityService();
        List<UrunDetayDto> urunler = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (UrunDetayDto urun : urunler){
            System.out.println(urun);
        }

    }
}
