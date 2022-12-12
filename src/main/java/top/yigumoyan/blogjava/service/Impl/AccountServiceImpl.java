package top.yigumoyan.blogjava.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.yigumoyan.blogjava.entity.Account;
import top.yigumoyan.blogjava.mapper.AccountMapper;
import top.yigumoyan.blogjava.service.AccountService;

import java.util.List;

@Service
@Component
public class AccountServiceImpl implements AccountService {

    private AccountMapper accountMapper;

    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public int insertAccount(Account account) {
        return accountMapper.insertAccount(account);
    }

    @Override
    public int deleteAccountById(String id) {
        return accountMapper.deleteAccountById(id);
    }

    @Override
    public int updateAccountById(Account account) {
        return accountMapper.updateAccountById(account);
    }

    @Override
    public List<Account> selectAllAccount() {
        return accountMapper.selectAllAccount();
    }

    @Override
    public Account selectAccountById(String id) {
        return accountMapper.selectAccountById(id);
    }
}
