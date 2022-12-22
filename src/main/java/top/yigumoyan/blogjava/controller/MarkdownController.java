package top.yigumoyan.blogjava.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yigumoyan.blogjava.entity.Markdown;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.MarkdownServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/markdown")
@CrossOrigin
public class MarkdownController {

    @Resource
    private MarkdownServiceImpl markdownService;

    @PostMapping("/insertMarkdown")
    public Result insertMarkdown(@RequestBody Markdown markdown) {
        markdownService.insertMarkdown(markdown);
        return Result.ok(true);
    }

    @PostMapping("/deleteMarkdownById")
    public Result deleteMarkdownById(@RequestBody JSONObject json) {
        markdownService.deleteMarkdownById((Integer) json.get("id"));
        return Result.ok();
    }

    @PostMapping("/updateMarkdown")
    public Result updateMarkdown(@RequestBody Markdown markdown) {
        markdownService.updateMarkdownById(markdown);
        return Result.ok(true);
    }

    @GetMapping("/selectAllMarkdown")
    public Result selectAllMarkdown() {
        return Result.ok(markdownService.selectAllMarkdown());
    }

    @PostMapping("/selectMarkdownByClassification")
    public Result selectMarkdownByClassification(@RequestBody JSONObject json) {
        return Result.ok(markdownService.selectMarkdownByClassification((String) json.get("label")));
    }

    @PostMapping("/selectMarkdownById")
    public Result selectMarkdownById(@RequestBody JSONObject json) {
        System.out.println(json.get("id"));
        return Result.ok(markdownService.selectMarkdownById((Integer) json.get("id")));
    }

    @GetMapping("/selectAllClassification")
    public Result selectAllClassification() {
        List<String> strings = markdownService.selectAllClassification();
        List<String> classificationList = new ArrayList<>();
        for (String str : strings) {
            for (String s : str.split("\\|")) {
                if (!classificationList.contains(s)) {
                    classificationList.add(s);
                }
            }
        }
        return Result.ok(classificationList);
    }
}
