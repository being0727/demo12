package com.example.being.demo12;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/getUser")
    public Map<String, Object> getUser(@RequestParam Integer id) {
        LOGGER.error("错误调试 11111");
        LOGGER.info("info调试 122222");

        Map<String, Object> data = new HashMap<>();
        data.put("id", id);
        data.put("userName", "admin");
        data.put("from", "provider-A");
        return data;
    }
}
