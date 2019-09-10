package com.models.struct.bridge;

/**
 *
 */
public class UrgentSendMessage extends AbstractSendMessage {


    public UrgentSendMessage(SendMessage sendMessage) {
        super(sendMessage);
    }

    @Override
    public void urgentSend() {
        super.urgentSend();
        otherOperation();
    }

    private void otherOperation() {
        System.out.println("这里可以监控短信发送，或者其它操作");
    }
}