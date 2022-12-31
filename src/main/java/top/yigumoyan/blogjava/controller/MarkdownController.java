package top.yigumoyan.blogjava.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yigumoyan.blogjava.entity.Markdown;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.MarkdownServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/markdown")
@CrossOrigin
@Component
public class MarkdownController {

    @Resource
    private MarkdownServiceImpl markdownService;

    @PostMapping("/insertMarkdown")
    public Result<Boolean> insertMarkdown(@RequestBody Markdown markdown) {
        markdownService.insertMarkdown(markdown);
        return Result.ok(true);
    }

    @PostMapping("/deleteMarkdownById")
    public Result deleteMarkdownById(@RequestBody JSONObject json) {
        markdownService.deleteMarkdownById((Integer) json.get("id"));
        return Result.ok();
    }

    @PostMapping("/updateMarkdown")
    public Result<Boolean> updateMarkdown(@RequestBody Markdown markdown) {
        markdownService.updateMarkdownById(markdown);
        return Result.ok(true);
    }

    @GetMapping("/selectAllMarkdown")
    public Result<List<Markdown>> selectAllMarkdown() {
        return Result.ok(markdownService.selectAllMarkdown());
    }

    @GetMapping("/selectAllMarkdownMessage")
    public Result<List<Markdown>> selectAllMarkdownMessage() {
        return Result.ok(markdownService.selectAllMarkdownMessage());
    }

    @PostMapping("/selectMarkdownContentById")
    public Result<Markdown> selectMarkdownContentById(@RequestBody JSONObject json) {
        return Result.ok(markdownService.selectMarkdownContentById(Integer.parseInt(json.getString("id"))));
    }

    @PostMapping("/selectMarkdownByClassification")
    public Result<List<Markdown>> selectMarkdownByClassification(@RequestBody JSONObject json) {
        return Result.ok(markdownService.selectMarkdownByClassification(json.getString("tag")));
    }


    @PostMapping("/selectMarkdownByClassifications")
    public Result selectMarkdownByClassifications(@RequestBody JSONObject json) {
        List<String> tagList = (List<String>) json.get("tags");
        List<Markdown> markdownList = new ArrayList<>();
        for (String tag : tagList) {
            for (Markdown markdown : markdownService.selectMarkdownByClassification(tag)) {
                if (!markdownList.contains(markdown)) {
                    markdownList.add(markdown);
                }
            }
        }
        return Result.ok(markdownList);
    }

    @PostMapping("/selectMarkdownById")
    public Result<Markdown> selectMarkdownById(@RequestBody JSONObject json) {
        System.out.println();
        return Result.ok(markdownService.selectMarkdownById(Integer.parseInt(json.getString("id"))));
    }

    @GetMapping("/selectAllClassification")
    public Result<List<String>> selectAllClassification() {
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
