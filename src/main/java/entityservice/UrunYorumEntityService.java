package entityservice;

import dao.UrunYorumDao;
import dto.KullaniciYorumDetayDto;
import dto.YorumCountDto;
import dto.YorumDetayDto;
import entity.UrunYorum;

import java.util.List;

public class UrunYorumEntityService {
    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService(){
        urunYorumDao = new UrunYorumDao();
    }

    public List<YorumDetayDto> findAllYorum(){
        return urunYorumDao.findCommentsForOne();
    }

    public List<YorumCountDto> findNumberOfCommentToUrun(){
        return urunYorumDao.findNumberOfCommentToUrun();

    }
    public List<KullaniciYorumDetayDto> findKullaniciYorum(Long id){
        return urunYorumDao.findKullaniciComment(id);
    }
}

