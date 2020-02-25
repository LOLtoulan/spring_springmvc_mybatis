package com.toulan.dao;

import com.toulan.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author LOL_toulan
 * @Time 2020/2/25 10:26
 * @Message
 */
@Repository
public interface AccountDAO {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 查找单个
     * @param id
     * @return
     */
    public Account findById(Integer id);

    /**
     * 删除账户
     * @param id
     */
    public void delAccount(Integer id);

    /**
     * 更改信息
     * @param account
     */
    public void updateAccount(Account account);

    /**
     * 转账操作
     * @param sourceName
     * @param targetName
     * @param money
     */
    //public void transferAccount(String sourceName, String targetName, float money);
}
