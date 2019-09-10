package com.models.struct.bridge;

/**
 *
 */
public abstract class AbstractSendMessage {

    protected SendMessage sendMessage;

    /**
     * Default constructor
     */
    public AbstractSendMessage(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }


    /**
     *
     */
    public void urgentSend() {
        this.sendMessage.send();
    }

}