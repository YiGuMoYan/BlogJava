package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.About;

import java.util.List;

@Mapper
@Repository
public interface AboutMapper {

    public int insertAbout(About about);

    public int deleteAboutById(int id);

    public int updateAbout(About about);

    public List<About> selectAllAbout();

    public About selectAboutById(int id);
}
