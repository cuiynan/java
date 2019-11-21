package com.test;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author : cuiyingnan
 * @date : 2019/11/21 15:38
 * @desc :
 */
@Data
@ToString
@Builder
public class UserTest {
    String username;
    String password;
}
