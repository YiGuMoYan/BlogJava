package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.Visitor;

import java.util.List;

public interface VisitorService {

    public int updateVisitor(Visitor visitor);

    public List<Visitor> selectAllVisitor();
}
