package com.models.behavior.state;

import java.util.*;

/**
 * 
 */
public class GaoFeng implements ELectState {

    /**
     * 
     */
    @Override
    public void handler() {
        System.out.println("here is 高峰价 n * 1.2");
    }

}