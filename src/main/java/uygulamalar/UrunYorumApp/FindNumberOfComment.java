package uygulamalar.UrunYorumApp;

import dto.YorumCountDto;
import dto.YorumDetayDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindNumberOfComment {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();

        List<YorumCountDto> list =service.findNumberOfCommentToUrun();

        for(YorumCountDto yorum : list){
            System.out.println(yorum);
        }

    }
}
