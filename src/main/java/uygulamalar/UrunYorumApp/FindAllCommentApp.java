package uygulamalar.UrunYorumApp;

import dto.YorumDetayDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindAllCommentApp {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();

        List<YorumDetayDto> list = service.findAllYorum();

        for(YorumDetayDto yorum: list){
            System.out.println(yorum);
        }
    }
}
