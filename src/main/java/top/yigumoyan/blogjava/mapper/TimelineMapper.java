package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.Timeline;

import java.util.List;

@Mapper
@Repository
public interface TimelineMapper {

    public int insertTimeline(Timeline timeline);

    public int deleteTimelineById(int id);

    public int updateTimeline(Timeline timeline);

    public List<Timeline> selectAllTimeline();
}
