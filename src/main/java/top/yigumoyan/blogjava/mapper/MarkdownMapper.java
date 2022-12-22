package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.Markdown;

import java.util.List;

@Mapper
@Repository
public interface MarkdownMapper {

    public int insertMarkdown(Markdown markdown);

    public int deleteMarkdownById(int id);

    public int updateMarkdownById(Markdown markdown);

    public List<Markdown> selectAllMarkdown();

    public List<Markdown> selectMarkdownByClassification(String classification);

    public Markdown selectMarkdownById(int id);

    public List<String> selectAllClassification();
}
