package top.yigumoyan.blogjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.yigumoyan.blogjava.service.Impl.MarkdownServiceImpl;

import javax.annotation.Resource;

@SpringBootTest
class BlogJavaApplicationTests {

    @Resource
    private MarkdownServiceImpl markdownService;

    @Test
    void contextLoads() {
        System.out.println(markdownService.selectAllMarkdown());
    }

}
