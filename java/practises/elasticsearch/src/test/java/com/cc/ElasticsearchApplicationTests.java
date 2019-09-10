package com.cc;

import com.cui.entity.User;
import com.cc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableElasticsearchRepositories
public class ElasticsearchApplicationTests {

    @Autowired
    UserService userService;


    @Test
    public void save() {
        User user = new User();
        user.setAge(1);
        user.setBirthDay(new Date());
        user.setTelNum("1861252222222");
        user.setUserName("崔测试一下");
        userService.saveUser(user);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId("cXOZk2gB8wzq4XV0ML0d");
        userService.deleteById(user);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId("zHODkmgB8wzq4XV0Bl6c");
        User entity = userService.findById(user);
        entity.setUserName("更改后的中文名称ok");
        //userService.updateUserById(entity);
    }


    @Test
    public void search() {
        User user = new User();
        user.setId("rHOrk2gB8wzq4XV0BcUx");
        user.setUserName("崔");
//        User entity = userService.findById(user);
//        System.out.println(entity);

        System.out.println("--------------------------------");
        List<User> userList = userService.findAll();
        for (User tmp : userList) {
//            System.out.println(tmp);
        }

        userList = userService.findByIdAndName(user);
        for (User tmp : userList) {
            System.out.println(tmp);
        }
    }

}

