package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.Timeline;
import top.yigumoyan.blogjava.mapper.TimelineMapper;
import top.yigumoyan.blogjava.service.TimelineService;

import java.util.List;

@Service
@Component
public class TimelineServiceImpl implements TimelineService {

    private TimelineMapper timelineMapper;

    @Autowired
    public void setTimelineMapper(TimelineMapper timelineMapper) {
        this.timelineMapper = timelineMapper;
    }

    @Override
    public int insertTimeline(Timeline timeline) {
        return timelineMapper.insertTimeline(timeline);
    }

    @Override
    public int deleteTimelineById(int id) {
        return timelineMapper.deleteTimelineById(id);
    }

    @Override
    public int updateTimeline(Timeline timeline) {
        return timelineMapper.updateTimeline(timeline);
    }

    @Override
    public List<Timeline> selectAllTimeline() {
        return timelineMapper.selectAllTimeline();
    }
}
