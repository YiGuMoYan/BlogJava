package top.yigumoyan.blogjava.service;

import top.yigumoyan.blogjava.entity.Account;

import java.util.List;

public interface AccountService {
    public int insertAccount(Account account);

    public int deleteAccountById(String id);

    public int updateAccountById(Account account);

    public List<Account> selectAllAccount();

    public Account selectAccountById(String id);
}
