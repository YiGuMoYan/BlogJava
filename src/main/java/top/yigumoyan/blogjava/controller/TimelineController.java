package top.yigumoyan.blogjava.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yigumoyan.blogjava.entity.Timeline;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.TimelineServiceImpl;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/timeline")
@CrossOrigin
@Component
public class TimelineController {

    @Resource
    private TimelineServiceImpl timelineService;

    @PostMapping("/insertTimeline")
    public Result insertTimeline(@RequestBody Timeline timeline) {
        System.out.println(timeline);
        timelineService.insertTimeline(timeline);
        return Result.ok(true);
    }

    @PostMapping("/deleteTimelineById")
    public Result deleteTimelineById(@RequestBody JSONObject json) {
        timelineService.deleteTimelineById(Integer.parseInt(json.getString("id")));
        return Result.ok(true);
    }

    @PostMapping("/updateTimeline")
    public Result updateTimeline(@RequestBody Timeline timeline) {
        timelineService.updateTimeline(timeline);
        return Result.ok(true);
    }

    @GetMapping("/selectAllTimeline")
    public Result selectAllTimeline() {
        return Result.ok(timelineService.selectAllTimeline());
    }
}