package com.blzf.wallet.controller;

import com.blzf.wallet.common.PageResultBean;
import com.blzf.wallet.common.ResultBean;
import com.blzf.wallet.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/get_verify_code")
    @ResponseBody
    public ResultBean getVerifyCode() {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("verify_code", "hello,world");
        return ResultBean.success(node);
    }

    @PostMapping("/bind_mailbox")
    @ResponseBody
    public ResultBean bindMailbox(@Valid @RequestBody Mailbox mb) {
        return ResultBean.success();
    }

    @PostMapping("/change_password")
    @ResponseBody
    public ResultBean changePassword(@Valid @RequestBody ChangePassword cp) {
        return ResultBean.success();
    }

    @PostMapping("/set_trade_password")
    @ResponseBody
    public ResultBean setTradePassword(@Valid @RequestBody SetPassword sp) {
        return ResultBean.success();
    }

    @PostMapping("/change_trade_password")
    @ResponseBody
    public ResultBean changeTradePassword(@Valid @RequestBody ChangePassword cp) {
        return ResultBean.success();
    }

    @GetMapping("/get_bank_list")
    @ResponseBody
    public PageResultBean<Bank> getBankList() {
        Bank bank1 = new Bank();
        bank1.setBank_name("OCBC");
        bank1.setBank_number("123");
        bank1.setAccount_name("abc");
        bank1.setBranch_name("Singapore");
        Bank bank2 = new Bank();
        bank2.setBank_name("CMB");
        bank2.setBank_number("456");
        bank2.setAccount_name("lmn");
        bank2.setBranch_name("HK");
        List<Bank> banks = new ArrayList<>();
        banks.add(bank1);
        banks.add(bank2);
        return new PageResultBean<>(2, banks);
    }

    @GetMapping("/get_wallet_list")
    @ResponseBody
    public PageResultBean<Wallet> getWalletList() {
        Wallet wallet1 = new Wallet();
        wallet1.setAddress("abc");
        wallet1.setName("go");
        wallet1.setAddress("fdahufeahup");
        Wallet wallet2 = new Wallet();
        wallet2.setAddress("lmn");
        wallet2.setName("xxxx");
        wallet2.setAddress("fads;jkfdja;d;kf;;");
        List<Wallet> wallets = new ArrayList<>();
        wallets.add(wallet1);
        wallets.add(wallet2);
        return new PageResultBean<>(2, wallets);
    }

    @PostMapping("/add_bank")
    @ResponseBody
    public ResultBean addBack(@Valid @RequestBody Bank bank) {
        return ResultBean.success();
    }

    @PostMapping("/add_wallet")
    @ResponseBody
    public ResultBean addWallet(@Valid @RequestBody Wallet wallet) {
        return ResultBean.success();
    }
}
