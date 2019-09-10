package com.models;

import com.models.create.template.Audi;
import com.models.create.template.Cruze;
import com.models.create.template.Template;
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
        Template car = audi;
        assertNotEquals(null, audi);
        car.create();

        car = cruze;
        car.create();
    }


}