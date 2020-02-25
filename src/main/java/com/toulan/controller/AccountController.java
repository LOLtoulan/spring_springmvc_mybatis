package com.toulan.controller;

import com.toulan.domain.Account;
import com.toulan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author LOL_toulan
 * @Time 2020/2/25 16:38
 * @Message
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public String  findAll(Model model){
        System.out.println("测试mvc");
        List<Account> all = service.findAll();
        model.addAttribute("account", all);
        System.out.println(all);
        return "success";
    }

    @RequestMapping("/findById")
    public String findById(int id) {
        Account account = service.findById(id);
        System.out.println("==============================");
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/delById")
    public String delById(int id) {
        service.delAccount(id);
        System.out.println("==============================");
        List<Account> all = service.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        service.saveAccount(account);
        System.out.println("==============================");
        List<Account> all = service.findAll();
        for (Account a : all) {
            System.out.println(a);
        }
        return "success";
    }


    @RequestMapping("/updateAccount")
    public String updateAccount(Account account) {
        service.updateAccount(account);
        System.out.println("==============================");
        List<Account> all = service.findAll();
        for (Account a : all) {
            System.out.println(a);
        }
        return "success";
    }

    @RequestMapping("/transferAccount")
    public String transferAccount(int sourceId,int targetId,float money) {
        service.transferAccount(sourceId, targetId, money);
        System.out.println("==============================");
        List<Account> all = service.findAll();
        for (Account a : all) {
            System.out.println(a);
        }
        return "success";
    }
}
