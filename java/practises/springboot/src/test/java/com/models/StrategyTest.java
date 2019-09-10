package com.models;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.models.create.strategy.InspirationContext;
import com.models.create.strategy.One;
import com.models.create.strategy.Three;
import com.models.create.strategy.Two;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 策略设计模式
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StrategyTest {

    @Autowired
    One one;
    @Autowired
    Two two;
    @Autowired
    Three three;

    @Test
    public void test() {
        BloomFilter filter = BloomFilter.create(Funnels.integerFunnel(), 100000);
        filter.put("aadf");
        if (filter.mightContain("aaf")) {
            //已匹配
        } else {
            //无匹配
        }
// 1.0版本
//        InspirationContext proxy = new InspirationContext(new One());
//        proxy.open();
//
//        proxy = new InspirationContext(new Two());
//        proxy.open();
//
//        proxy = new InspirationContext(new Three());
//        proxy.open();
        //2.0版本
        InspirationContext proxy = new InspirationContext(one);
        proxy.open();

        proxy = new InspirationContext(two);
        proxy.open();

        proxy = new InspirationContext(three);
        proxy.open();
    }
}