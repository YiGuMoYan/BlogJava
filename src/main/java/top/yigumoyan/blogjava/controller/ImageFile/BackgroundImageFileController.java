package top.yigumoyan.blogjava.controller.ImageFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.yigumoyan.blogjava.entity.ImageFile;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.ImageFileService;
import top.yigumoyan.blogjava.service.Impl.ImageFileServiceImpl;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/backgroundImageFile")
public class BackgroundImageFileController {

    @Resource
    private ImageFileServiceImpl imageFileService;

    @Value("${BlogJava.domain}")
    private String domain;

    @Value("${BlogJava.prefix}")
    private String prefix;

    @Value("${BlogJava.filePath}")
    private String filePath;

    @PostMapping("/upload")
    public Result upload(MultipartFile multipartFile) throws IOException {
        String originalFilename = multipartFile.getOriginalFilename();
        String pathName = filePath + originalFilename;
        multipartFile.transferTo(new File(pathName));
        imageFileService.insertImageFile(new ImageFile(originalFilename));
        return Result.ok();
    }
}
