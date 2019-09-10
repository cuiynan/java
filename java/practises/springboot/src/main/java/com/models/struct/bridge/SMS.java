package com.models.struct.bridge;

/**
 * 短信发送
 */
public class SMS implements SendMessage {


    /**
     *
     */
    @Override
    public void send() {
        System.out.println("短信发送成功");
    }

}