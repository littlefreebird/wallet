package com.blzf.wallet.controller;

import com.blzf.wallet.common.ResultBean;
import com.blzf.wallet.model.Register;
import com.blzf.wallet.model.User;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class LoginController {
    @PostMapping("/login")
    @ResponseBody
    public ResultBean login(User user) {
       return ResultBean.success();
    }

    @PostMapping("/register")
    @ResponseBody
    public ResultBean register(@Valid @RequestBody Register register) {
        return ResultBean.success();
    }
}
