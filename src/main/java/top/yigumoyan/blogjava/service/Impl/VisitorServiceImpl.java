package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.Visitor;
import top.yigumoyan.blogjava.mapper.VisitorMapper;
import top.yigumoyan.blogjava.service.VisitorService;

import java.util.List;

@Service
@Component
public class VisitorServiceImpl implements VisitorService {

    private VisitorMapper visitorMapper;

    @Autowired
    public void setVisitorMapper(VisitorMapper visitorMapper) {
        this.visitorMapper = visitorMapper;
    }

    @Override
    public int updateVisitor(Visitor visitor) {
        return visitorMapper.updateVisitor(visitor);
    }

    @Override
    public List<Visitor> selectAllVisitor() {
        return visitorMapper.selectAllVisitor();
    }
}
