package com.cc;

import com.cui.entity.User;
import com.cui.net.HttpRest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

/**
 * @author : cuiyingnan
 * @date : 2019/8/12 16:17
 * @desc :
 */
public class RestfulHttp {

    String url = "http://localhost:8080/test";

    @Test
    public void test() {
        HttpRest rest = new HttpRest();
        String result = rest.getForObject(url, String.class);
        System.out.println(result);
    }

    @Test
    public void test1() {
        User user = new User();
        user.setName("name");
        user.setUid("123");
        user.setPwd("321");

//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(type);

        HttpEntity<User> formEntity = new HttpEntity<User>(user);

        HttpRest rest = new HttpRest();

        ResponseEntity<User> result = rest.postForEntity(url, formEntity, User.class);
        System.out.println(result.getStatusCode());
        System.out.println(result);
    }
}
