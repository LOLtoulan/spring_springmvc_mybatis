package com.toulan.service.impl;

import com.toulan.dao.AccountDAO;
import com.toulan.domain.Account;
import com.toulan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LOL_toulan
 * @Time 2020/2/25 10:41
 * @Message
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public List<Account> findAll() {
        return accountDAO.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDAO.saveAccount(account);
    }

    @Override
    public Account findById(Integer id) {
        return accountDAO.findById(id);
    }

    @Override
    public void delAccount(Integer id) {
        accountDAO.delAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        Account accountDAOById = accountDAO.findById(account.getId());

        accountDAOById.setName(account.getName());
        accountDAOById.setMoney(account.getMoney());

        accountDAO.updateAccount(accountDAOById);
    }

    @Override
    public void transferAccount(int sourceId, int targetId, float money) {
        Account sourceAccount = accountDAO.findById(sourceId);
        Account targetAccount = accountDAO.findById(targetId);

        float sourceAccountMoney = sourceAccount.getMoney();
        float targetAccountMoney = targetAccount.getMoney();

        sourceAccount.setMoney(sourceAccountMoney - money);
        int i = 1 / 0;
        targetAccount.setMoney(targetAccountMoney + money);

        accountDAO.updateAccount(sourceAccount);
        accountDAO.updateAccount(targetAccount);

    }


}
