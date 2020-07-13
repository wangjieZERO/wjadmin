package com.wangjie.controller;

import com.wangjie.model.SysUser;
import com.wangjie.service.UserService;
import com.wangjie.util.IPUtils;
import com.wangjie.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@Api(value = "用户管理")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ApiOperation(value = "用户注册")
    public Object resgisterUser(@RequestBody SysUser user, HttpServletRequest request) {
        String ipAddr = IPUtils.getIpAddr(request);
        user.setRegisterIp(ipAddr);
        int num = userService.insert(user);
        return ResponseUtil.ok(num);
    }
}
