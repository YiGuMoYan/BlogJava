package top.yigumoyan.blogjava.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yigumoyan.blogjava.entity.Hitokoto;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.HitokotoServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/hitokoto")
@CrossOrigin
public class HitokotoController {

    @Resource
    private HitokotoServiceImpl hitokotoService;

    @PostMapping("/insertHitokoto")
    public Result insertHitokoto(@RequestBody Hitokoto hitokoto) {
        hitokotoService.insertHitokoto(hitokoto);
        return Result.ok(true);
    }

    @PostMapping("/deleteHitokoto")
    public Result deleteHitokoto(@RequestBody JSONObject json) {
        hitokotoService.deleteHitokotoById((Integer) json.get("id"));
        return Result.ok(true);
    }

    @PostMapping("/updateHitokoto")
    public Result updateHitokoto(@RequestBody Hitokoto hitokoto) {
        hitokotoService.updateHitokotoById(hitokoto);
        return Result.ok(true);
    }

    @GetMapping("/selectAllHitokoto")
    public Result selectAllHitokoto() {
        List<Hitokoto> hitokotos = hitokotoService.selectAllHitokoto();
        return Result.ok(hitokotos);
    }

    @PostMapping("/selectHitokotoById")
    public Result selectHitokotoById(@RequestBody JSONObject json) {
        Hitokoto hitokoto = hitokotoService.selectHitokotoById((Integer) json.get("id"));
        return Result.ok(hitokoto);
    }

    @GetMapping("/selectHitokoto")
    public Result selectHitokoto() {
        return Result.ok(hitokotoService.selectHitokoto());
    }
}
