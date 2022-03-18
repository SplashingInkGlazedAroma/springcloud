package com.xtl.controller;

import com.xtl.domain.CommonResult;
import com.xtl.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author xtl
 * @Date 2022/3/7 23:15
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult<>(200,"扣减账户金额成功");
    }
}
