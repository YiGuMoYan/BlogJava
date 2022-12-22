package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.Markdown;

import java.util.List;

public interface MarkdownService {

    public int insertMarkdown(Markdown markdown);

    public int deleteMarkdownById(int id);

    public int updateMarkdownById(Markdown markdown);

    public List<Markdown> selectAllMarkdown();

    public List<Markdown> selectAllMarkdownMessage();

    public List<Markdown> selectMarkdownByClassification(String classification);

    public Markdown selectMarkdownById(int id);

    public Markdown selectMarkdownContentById(int id);

    public List<String> selectAllClassification();
}
