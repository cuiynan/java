package com.models.struct.bridge;

/**
 *
 */
public class Email implements SendMessage {


    /**
     *
     */
    @Override
    public void send() {
        System.out.println("邮件发送成功");
    }

}