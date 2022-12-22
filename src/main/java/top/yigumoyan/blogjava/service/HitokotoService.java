package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.Hitokoto;

import java.util.List;

public interface HitokotoService {
    public int insertHitokoto(Hitokoto hitokoto);

    public int deleteHitokotoById(int id);

    public int updateHitokotoById(Hitokoto hitokoto);

    public List<Hitokoto> selectAllHitokoto();

    public Hitokoto selectHitokotoById(int id);

    public Hitokoto selectHitokoto();
}
