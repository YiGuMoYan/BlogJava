package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.Timeline;

import java.util.List;

public interface TimelineService {

    public int insertTimeline(Timeline timeline);

    public int deleteTimelineById(int id);

    public int updateTimeline(Timeline timeline);

    public List<Timeline> selectAllTimeline();
}
