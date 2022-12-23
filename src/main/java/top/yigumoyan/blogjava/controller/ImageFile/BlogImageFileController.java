package top.yigumoyan.blogjava.controller.ImageFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.yigumoyan.blogjava.result.Result;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("/blogImageFile")
@RestController
@CrossOrigin
public class BlogImageFileController {

    @Value("${BlogJava.domain}")
    private String domain;

    @Value("${BlogJava.prefix}")
    private String prefix;

    @Value("${BlogJava.file-path}")
    private String filePath;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {
        try {
            String originalFilename = file.getOriginalFilename();
            String[] split = originalFilename.split("\\.");
            String extendName = split[split.length - 1];
            String fileName = UUID.randomUUID().toString() + "." + extendName;
            String pathName = filePath + fileName;
            file.transferTo(new File(pathName));
            String url = domain + prefix + fileName;
            return Result.ok(url);
        } catch (IOException | IllegalStateException e) {
            return Result.fail();
        }
    }
}
