package com.models.behavior.commond.other;

/**
 *
 */
public class OffCommond implements Commond {

    TV tv;

    public OffCommond(TV tv){
        this.tv = tv;
    }

    /**
     *
     */
    @Override
    public void execute() {
        tv.trunOff();
    }

}