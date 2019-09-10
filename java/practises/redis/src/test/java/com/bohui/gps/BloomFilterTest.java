package com.bohui.gps;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.models.create.strategy.InspirationContext;
import com.models.create.strategy.One;
import com.models.create.strategy.Three;
import com.models.create.strategy.Two;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BloomFilterTest {

    /**
     *
     */
    @Test
    public void test() {
        BloomFilter filter = BloomFilter.create(Funnels.integerFunnel(), 100000);
        filter.put("aadf");
        if (filter.mightContain("aaf")) {
            //已匹配
        } else {
            //无匹配
        }
    }
}