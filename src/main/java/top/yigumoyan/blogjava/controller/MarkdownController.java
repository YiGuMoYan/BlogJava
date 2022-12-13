package top.yigumoyan.blogjava.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yigumoyan.blogjava.entity.Markdown;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.MarkdownServiceImpl;

import javax.annotation.Resource;

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

    @PostMapping("/selectMarkdownById")
    public Result selectMarkdownById(@RequestBody JSONObject json) {
        return Result.ok(markdownService.selectMarkdownById((Integer) json.get("id")));
    }
}
