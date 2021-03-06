package com.toulan.service;

import com.toulan.domain.Account;

import java.util.List;

/**
 * @Author LOL_toulan
 * @Time 2020/2/25 10:41
 * @Message
 */
public interface AccountService {
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
     * @param sourceId
     * @param targetId
     * @param money
     */
    public void transferAccount(int sourceId, int targetId, float money);
}
