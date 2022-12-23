package top.yigumoyan.blogjava.controller.ImageFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.yigumoyan.blogjava.entity.ImageFile;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.ImageFileServiceImpl;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/backgroundImageFile")
@CrossOrigin
public class BackgroundImageFileController {

    @Resource
    private ImageFileServiceImpl imageFileService;

    @Value("${BlogJava.domain}")
    private String domain;

    @Value("${BlogJava.prefix}" + "background/")
    private String prefix;

    @Value("${BlogJava.file-path}" + "background/")
    private String filePath;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String[] split = originalFilename.split("\\.");
        String extendName = split[split.length - 1];
        String fileName = UUID.randomUUID().toString() + "." + extendName;
        imageFileService.insertImageFile(new ImageFile(fileName));
        String pathName = filePath + fileName;
        file.transferTo(new File(pathName));
        String url = domain + prefix + fileName;
        return Result.ok(url);
    }

    @GetMapping("/selectBackgroundImageFile")
    public Result selectBackgroundImageFile() {
        ImageFile imageFile = imageFileService.selectImageFile();
        String url = domain + prefix + imageFile.getName();
        return Result.ok(url);
    }
}
