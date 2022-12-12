package top.yigumoyan.blogjava.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.yigumoyan.blogjava.entity.Account;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    public int insertAccount(Account account);

    public int deleteAccountById(String id);

    public int updateAccountById(Account account);

    public List<Account> selectAllAccount();

    public Account selectAccountById(String id);
}
