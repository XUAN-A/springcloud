package com.axuan.springcloud.controller;

import com.axuan.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author axuan
 * @date 2022/4/17 上午9:00
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public void sendMessage() {
        messageProvider.send();
    }
}
