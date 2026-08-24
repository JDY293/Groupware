package com.groupware.groupware_backend.controller;

import com.groupware.groupware_backend.mapper.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestMapper testMapper;

    public TestController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @GetMapping("/test")
    public String test() {
        return testMapper.test();
    }
}