package top.yigumoyan.blogjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yigumoyan.blogjava.entity.Markdown;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.MarkdownServiceImpl;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/markdown")
public class MarkdownController {

    @Resource
    private MarkdownServiceImpl markdownService;

    @PostMapping("/insertMarkdown")
    public Result insertMarkdown(Markdown markdown) {
        markdownService.insertMarkdown(markdown);
        return Result.ok();
    }

    @PostMapping("/deleteMarkdownById")
    public Result deleteMarkdownById(int id) {
        markdownService.deleteMarkdownById(id);
        return Result.ok();
    }

    @PostMapping("/updateMarkdown")
    public Result updateMarkdown(Markdown markdown) {
        markdownService.updateMarkdownById(markdown);
        return Result.ok();
    }

    @GetMapping("/selectAllMarkdown")
    public Result selectAllMarkdown() {
        return Result.ok(markdownService.selectAllMarkdown());
    }

    @PostMapping("/selectMarkdownById")
    public Result selectMarkdownById(int id) {
        return Result.ok(markdownService.selectMarkdownById(id));
    }
}
