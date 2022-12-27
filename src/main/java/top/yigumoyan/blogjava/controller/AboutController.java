package top.yigumoyan.blogjava.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yigumoyan.blogjava.entity.About;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.AboutServiceImpl;

import javax.annotation.Resource;


@Controller
@ResponseBody
@RequestMapping("/about")
@CrossOrigin
@Component
public class AboutController {

    @Resource
    private AboutServiceImpl aboutService;

    @PostMapping("/insertAbout")
    public Result insertAbout(About about) {
        aboutService.insertAbout(about);
        return Result.ok(true);
    }

    @PostMapping("/deleteAboutById")
    public Result deleteAboutById(int id) {
        aboutService.deleteAboutById(id);
        return Result.ok(true);
    }

    @PostMapping("/updateAbout")
    public Result updateAbout(About about) {
        aboutService.updateAbout(about);
        return Result.ok(true);
    }

    @PostMapping("/selectAllAbout")
    public Result selectAllAbout() {
        return Result.ok(aboutService.selectAllAbout());
    }

    @PostMapping("/selectAboutById")
    public Result selectAboutById(int id) {
        return Result.ok(aboutService.selectAboutById(id));
    }

    @PostMapping("/selectOneAbout")
    public Result selectOneAbout() {
        return Result.ok(aboutService.selectAllAbout().get(0));
    }

}
