package com.sys.auth.services;

import com.sys.auth.reponsitory.SysUser;
import com.sys.auth.reponsitory.SysUserExample;
import com.sys.auth.reponsitory.SysUserMapper;
import com.sys.auth.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2020/4/16 16:51
 * @desc :
 */
@Service
public class AuthoritySerivce {

    @Autowired
    SysUserMapper sysUserMapper;

    public SysUser login(LoginRequest request) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginAccountEqualTo(request.getUserName());
        criteria.andPasswordEqualTo(request.getPassword());
        List<SysUser> users = sysUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }

}
