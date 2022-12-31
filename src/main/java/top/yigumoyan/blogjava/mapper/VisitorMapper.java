package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.Visitor;

import java.util.List;

@Mapper
@Repository
public interface VisitorMapper {

    public int updateVisitor(Visitor visitor);

    public List<Visitor> selectAllVisitor();
}
