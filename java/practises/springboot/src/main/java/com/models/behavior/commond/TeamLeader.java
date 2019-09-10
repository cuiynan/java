package com.models.behavior.commond;

import lombok.Data;

import java.util.*;

/**
 * 
 */
@Data
public class TeamLeader {

    private Commond commond;

    /**
     * 
     */
    public void action() {
        commond.execute();
    }



}