package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.About;
import top.yigumoyan.blogjava.mapper.AboutMapper;
import top.yigumoyan.blogjava.service.AboutService;

import java.util.List;

@Service
@Component
public class AboutServiceImpl implements AboutService {

    private AboutMapper aboutMapper;

    @Autowired
    public void setAboutMapper(AboutMapper aboutMapper) {
        this.aboutMapper = aboutMapper;
    }

    @Override
    public int insertAbout(About about) {
        return aboutMapper.insertAbout(about);
    }

    @Override
    public int deleteAboutById(int id) {
        return aboutMapper.deleteAboutById(id);
    }

    @Override
    public int updateAbout(About about) {
        return aboutMapper.updateAbout(about);
    }

    @Override
    public List<About> selectAllAbout() {
        return aboutMapper.selectAllAbout();
    }

    @Override
    public About selectAboutById(int id) {
        return aboutMapper.selectAboutById(id);
    }
}
