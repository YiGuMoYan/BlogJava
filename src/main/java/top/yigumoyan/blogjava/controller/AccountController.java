package top.yigumoyan.blogjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.yigumoyan.blogjava.entity.Account;
import top.yigumoyan.blogjava.result.Result;
import top.yigumoyan.blogjava.service.Impl.AccountServiceImpl;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/account")
@CrossOrigin
public class AccountController {

    @Resource
    private AccountServiceImpl accountService;

    @PostMapping("/login")
    public Result login(Account account) {
        Account search = accountService.selectAccountById(account.getId());
        if (search != null && search.getPassword().equals(account.getPassword())) {
            return Result.ok(true);
        }
        return Result.ok(false);
    }
}
