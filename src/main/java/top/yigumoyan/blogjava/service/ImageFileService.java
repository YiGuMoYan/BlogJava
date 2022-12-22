package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.ImageFile;

import java.util.List;

public interface ImageFileService {

    public int insertImageFile(ImageFile imageFile);

    public int deleteImageFileById(int id);

    public List<ImageFile> selectAllImageFile();

    public ImageFile selectImageFile();
}
