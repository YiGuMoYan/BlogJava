package top.yigumoyan.blogjava.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yigumoyan.blogjava.entity.Visitor;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.VisitorServiceImpl;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/visitor")
@CrossOrigin
@Component
public class VisitorController {

    @Resource
    private VisitorServiceImpl visitorService;

    @GetMapping("/selectVisitor")
    public Result selectVisitor() {
        Visitor visitor = visitorService.selectAllVisitor().get(0);
        visitor.setNum(visitor.getNum() + 1);
        visitorService.updateVisitor(visitor);
        return Result.ok(visitor.getNum());
    }
}
