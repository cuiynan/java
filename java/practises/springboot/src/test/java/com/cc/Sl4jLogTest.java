package com.cc;

import com.cc.controller.Sl4jLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sl4jLogTest {

    @Autowired
    Sl4jLog sl4jLog;

    @Test
    public void log() {
        sl4jLog.log();
    }
}