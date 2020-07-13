package com.wangjie.controller;

import com.wangjie.model.Test;
import com.wangjie.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 */
@RestController
@RequiredArgsConstructor
public class TestController {


    private final TestService testService;

    @GetMapping("/test")
    public String TestMethod(@RequestParam(name = "id") Integer id) {
        System.out.println("this is a test controller");
        Test test = testService.getTestInfoById(id);
        if (test == null) {
            System.out.println("TestController.TestMethod");
        }
        return "this is a test";
    }
}
