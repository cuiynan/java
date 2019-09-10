package com.models.behavior.commond.other;

/**
 *
 */
public class ChangeChannelCommond implements Commond {

    /**
     *
     */
    public TV tv;

    public ChangeChannelCommond(TV tv) {
        this.tv = tv;
    }

    /**
     *
     */
    @Override
    public void execute() {
        tv.changeChannel();
    }

}