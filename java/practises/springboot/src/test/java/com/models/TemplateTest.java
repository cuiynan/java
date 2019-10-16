package com.models;

import com.models.behavior.template.Audi;
import com.models.behavior.template.Cruze;
import com.models.behavior.template.CarTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 模板设计模式
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TemplateTest {

    @Autowired
    Audi audi;
    @Autowired
    Cruze cruze;

    @Test
    public void templates(){
        CarTemplate car = audi;
        assertNotEquals(null, audi);
        car.create();

        car = cruze;
        car.create();
    }


}