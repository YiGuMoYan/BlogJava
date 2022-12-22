package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.yigumoyan.blogjava.entity.ImageFile;
import top.yigumoyan.blogjava.mapper.ImageFileMapper;
import top.yigumoyan.blogjava.service.ImageFileService;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@Component
public class ImageFileServiceImpl implements ImageFileService {

    private ImageFileMapper imageFileMapper;

    @Autowired
    public void setImageFileMapper(ImageFileMapper imageFileMapper) {
        this.imageFileMapper = imageFileMapper;
    }

    @Override
    public int insertImageFile(ImageFile imageFile) {
        return imageFileMapper.insertImageFile(imageFile);
    }

    @Override
    public int deleteImageFileById(int id) {
        return imageFileMapper.deleteImageFileById(id);
    }

    @Override
    public List<ImageFile> selectAllImageFile() {
        return imageFileMapper.selectAllImageFile();
    }

    @Override
    public ImageFile selectImageFile() {
        return imageFileMapper.selectImageFile();
    }
}
