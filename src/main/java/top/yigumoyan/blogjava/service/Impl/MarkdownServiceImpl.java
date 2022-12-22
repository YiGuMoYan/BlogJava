package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.Markdown;
import top.yigumoyan.blogjava.mapper.MarkdownMapper;
import top.yigumoyan.blogjava.service.MarkdownService;

import java.util.List;

@Service
@Component
public class MarkdownServiceImpl implements MarkdownService {

    public MarkdownMapper markdownMapper;

    @Autowired
    public void setMarkdownMapper(MarkdownMapper markdownMapper) {
        this.markdownMapper = markdownMapper;
    }

    @Override
    public int insertMarkdown(Markdown markdown) {
        return markdownMapper.insertMarkdown(markdown);
    }

    @Override
    public int deleteMarkdownById(int id) {
        return markdownMapper.deleteMarkdownById(id);
    }

    @Override
    public int updateMarkdownById(Markdown markdown) {
        return markdownMapper.updateMarkdownById(markdown);
    }

    @Override
    public List<Markdown> selectAllMarkdown() {
        return markdownMapper.selectAllMarkdown();
    }

    @Override
    public List<Markdown> selectAllMarkdownMessage() {
        return markdownMapper.selectAllMarkdownMessage();
    }

    @Override
    public List<Markdown> selectMarkdownByClassification(String classification) {
        return markdownMapper.selectMarkdownByClassification(classification);
    }

    @Override
    public Markdown selectMarkdownById(int id) {
        return markdownMapper.selectMarkdownById(id);
    }

    @Override
    public Markdown selectMarkdownContentById(int id) {
        return markdownMapper.selectMarkdownContentById(id);
    }

    @Override
    public List<String> selectAllClassification() {
        return markdownMapper.selectAllClassification();
    }
}
