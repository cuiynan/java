package com.models.struct.bridge;

/**
 * 此模式与策略设计模式的重点区别是：将行为上移扩展至桥接类中。
 */
public class Client {
    public static void main(String[] args) {
        SendMessage sendMessage = new SMS();
        AbstractSendMessage sms = new UrgentSendMessage(sendMessage);
        AbstractSendMessage email = new UrgentSendMessage(new Email());
        sms.urgentSend();

        email.urgentSend();
    }
}
