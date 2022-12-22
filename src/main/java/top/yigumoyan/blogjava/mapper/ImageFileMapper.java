package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.ImageFile;

import java.util.List;

@Mapper
@Repository
public interface ImageFileMapper {

    public int insertImageFile(ImageFile imageFile);

    public int deleteImageFileById(int id);

    public List<ImageFile> selectAllImageFile();

    public ImageFile selectImageFile();
}
