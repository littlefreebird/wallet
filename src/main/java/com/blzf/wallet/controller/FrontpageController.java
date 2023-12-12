package com.blzf.wallet.controller;

import com.blzf.wallet.common.PageResultBean;
import com.blzf.wallet.common.ResultBean;
import com.blzf.wallet.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/frontpage")
public class FrontpageController {
    @GetMapping("/get_user_info")
    @ResponseBody
    public ResultBean getUserInfo() {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("username", "apollo");
        return ResultBean.success(node);
    }

    @GetMapping("/get_system_notice")
    @ResponseBody
    public PageResultBean<Notice> getSystemNotice(@RequestParam(value = "page", defaultValue = "1") int page,
                                                  @RequestParam(value = "page_size", defaultValue = "10")int limit) {
        Notice n1 = new Notice();
        n1.setContent("hello, world");
        n1.setTime(1234);
        n1.setTitle("a");
        Notice n2 = new Notice();
        n2.setTime(9876);
        n2.setTitle("b");
        n2.setContent("xxxxxxxx");
        List<Notice> ns = new ArrayList<>();
        ns.add(n1);
        ns.add(n2);
        return new PageResultBean<>(2, ns);
    }

    @GetMapping("/get_system_announcement")
    @ResponseBody
    public PageResultBean<Notice> getSystemAnnouncement(@RequestParam(value = "page", defaultValue = "1") int page,
                                                        @RequestParam(value = "page_size", defaultValue = "10")int limit) {
        Notice n1 = new Notice();
        n1.setContent("hello, world");
        n1.setTime(1234);
        n1.setTitle("a");
        Notice n2 = new Notice();
        n2.setTime(9876);
        n2.setTitle("b");
        n2.setContent("xxxxxxxx");
        List<Notice> ns = new ArrayList<>();
        ns.add(n1);
        ns.add(n2);
        return new PageResultBean<>(2, ns);
    }

    @PostMapping("/transfer")
    @ResponseBody
    public ResultBean transfer(@Valid @RequestBody Transfer t) {
        return ResultBean.success();
    }

    @PostMapping("/withdraw_bank")
    @ResponseBody
    public ResultBean withdrawBank(@Valid @RequestBody WithdrawBank w) {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("status", 1);
        return ResultBean.success(node);
    }

    @PostMapping("/withdraw_wallet")
    @ResponseBody
    public ResultBean withdrawWallet(@Valid @RequestBody WithdrawWallet w) {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("status", 1);
        return ResultBean.success(node);
    }

    @GetMapping("/get_deposit_address")
    @ResponseBody
    public ResultBean getDepositAddress(@RequestParam(value = "protocol") String protocol) {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("address", "123abcxxx");
        return ResultBean.success(node);
    }

    @GetMapping("/get_balance")
    @ResponseBody
    public ResultBean getBalance() {
        ObjectMapper om = new ObjectMapper();
        ObjectNode node = om.createObjectNode();
        node.put("balance", 1.23);
        return ResultBean.success(node);
    }

    @GetMapping("/get_bill_list")
    @ResponseBody
    public PageResultBean<Bill> getBillList(@RequestParam(value = "page", defaultValue = "1") int page,
                                            @RequestParam(value = "page_size", defaultValue = "10")int limit) {

        Bill b1 = new Bill();
        b1.setAmount(1234);
        b1.setTime(123);
        b1.setCategory(1);
        b1.setId(3);
        Bill b2 = new Bill();
        b2.setCategory(4);
        b2.setId(4);
        b2.setAmount(789);
        b2.setTime(456);
        List<Bill> bs = new ArrayList<>();
        bs.add(b1);
        bs.add(b2);
        return new PageResultBean<>(2, bs);
    }

    @GetMapping("/get_transfer_detail")
    @ResponseBody
    public PageResultBean<TransferDetail> getTransferDetail(@RequestParam(value = "id") int id) {
        TransferDetail t = new TransferDetail();
        t.setAmount(1.234);
        t.setTime(45234);
        t.setRemark("fdahsji");
        t.setPeer_id(79900);
        List<TransferDetail> ts = new ArrayList<>();
        ts.add(t);
        return new PageResultBean<>(1, ts);
    }

    @GetMapping("/get_deposit_detail")
    @ResponseBody
    public PageResultBean<Deposit> getDepositDetail(@RequestParam(value = "id") int id) {
        Deposit d = new Deposit();
        d.setAddress("fadhuhjfdal");
        d.setAmount(56.7);
        d.setHash("fdahuohdfia");
        d.setTime(7899);
        d.setProtocol("TRC20");
        d.setStatus(1);
        List<Deposit> ds = new ArrayList<>();
        ds.add(d);
        return new PageResultBean<>(1, ds);
    }

    @GetMapping("/get_receive_detail")
    @ResponseBody
    public PageResultBean<ReceiveDetail> getReceiveDetail(@RequestParam(value = "id") int id) {
        ReceiveDetail r = new ReceiveDetail();
        r.setAmount(1.234);
        r.setTime(45234);
        r.setRemark("fdahsji");
        r.setPeer_id(79900);
        List<ReceiveDetail> rs = new ArrayList<>();
        rs.add(r);
        return new PageResultBean<>(1, rs);
    }

    @GetMapping("/get_withdraw_wallet_detail")
    @ResponseBody
    public PageResultBean<WithdrawWalletDetail> getWithdrawWalletDetail(@RequestParam(value = "id") int id) {
        WithdrawWalletDetail w = new WithdrawWalletDetail();
        w.setProtocol("ERC20");
        w.setStatus(1);
        w.setAmount(35423);
        w.setAddress("dfahj");
        w.setTime(78899);
        List<WithdrawWalletDetail> ws = new ArrayList<>();
        ws.add(w);
        return new PageResultBean<>(1, ws);
    }

    @GetMapping("/get_withdraw_bank_detail")
    @ResponseBody
    public PageResultBean<WithdrawBankDetail> getWithdrawBankDetail(@RequestParam(value = "id") int id) {
        WithdrawBankDetail w = new WithdrawBankDetail();
        w.setAmount(2453.342);
        w.setBank_id(543);
        w.setBank_account("afddffd");
        w.setRemark("afdfdafdf");
        w.setTime(7788);
        w.setBank_name("ICBC");
        List<WithdrawBankDetail> ws = new ArrayList<>();
        ws.add(w);
        return new PageResultBean<>(1, ws);
    }
}
