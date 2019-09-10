package com.models.behavior.commond.other;

import lombok.Data;

import java.util.*;

/**
 * 
 */
@Data
public class OnCommon implements Commond {

    TV tv;

    public OnCommon(TV tv){
        this.tv = tv;
    }

    /**
     * 
     */
    @Override
    public void execute() {
        tv.turnOn();
    }

}