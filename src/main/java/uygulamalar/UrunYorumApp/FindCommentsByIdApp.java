package uygulamalar.UrunYorumApp;

import dto.KullaniciYorumDetayDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindCommentsByIdApp {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<KullaniciYorumDetayDto> list = service.findKullaniciYorum(2L);
        for(KullaniciYorumDetayDto comment : list){
            System.out.println(comment);
        }

    }
}
