package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.About;

import java.util.List;

public interface AboutService {

    public int insertAbout(About about);

    public int deleteAboutById(int id);

    public int updateAbout(About about);

    public List<About> selectAllAbout();

    public About selectAboutById(int id);
}
