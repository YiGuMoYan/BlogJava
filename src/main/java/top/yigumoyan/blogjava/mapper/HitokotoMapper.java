package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.Hitokoto;

import java.util.List;

@Mapper
@Repository
public interface HitokotoMapper {

    public int insertHitokoto(Hitokoto hitokoto);

    public int deleteHitokotoById(int id);

    public int updateHitokotoById(Hitokoto hitokoto);

    public List<Hitokoto> selectAllHitokoto();

    public Hitokoto selectHitokotoById(int id);

    public Hitokoto selectHitokoto();
}
