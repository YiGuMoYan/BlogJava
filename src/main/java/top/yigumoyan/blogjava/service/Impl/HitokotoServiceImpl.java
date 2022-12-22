package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.Hitokoto;
import top.yigumoyan.blogjava.mapper.HitokotoMapper;
import top.yigumoyan.blogjava.service.HitokotoService;

import java.util.List;
import java.util.Random;

@Service
@Component
public class HitokotoServiceImpl implements HitokotoService {

    private HitokotoMapper hitokotoMapper;

    @Autowired
    public void setHitokotoMapper(HitokotoMapper hitokotoMapper) {
        this.hitokotoMapper = hitokotoMapper;
    }

    @Override
    public int insertHitokoto(Hitokoto hitokoto) {
        return hitokotoMapper.insertHitokoto(hitokoto);
    }

    @Override
    public int deleteHitokotoById(int id) {
        return hitokotoMapper.deleteHitokotoById(id);
    }

    @Override
    public int updateHitokotoById(Hitokoto hitokoto) {
        return hitokotoMapper.updateHitokotoById(hitokoto);
    }

    @Override
    public List<Hitokoto> selectAllHitokoto() {
        return hitokotoMapper.selectAllHitokoto();
    }

    @Override
    public Hitokoto selectHitokotoById(int id) {
        return hitokotoMapper.selectHitokotoById(id);
    }

    @Override
    public Hitokoto selectHitokoto() {
        return hitokotoMapper.selectHitokoto();
    }
}
