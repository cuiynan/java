package com.bohui.technical.register.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bohui.technical.register.pojo.register;
import com.bohui.technical.register.service.registerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工作简介
 *
 * @author cuiyingnan
 * @version v1.0
 * @date 2021-03-16
 */
@Api(tags = "工作简介")
@RestController
@RequestMapping(value = "/register")
public class registerController {
    @Autowired
    private registerService registerservice;

    @ApiOperation("创建工作简介")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ApiResponse save(HttpServletRequest request, HttpServletResponse response,@RequestBody  register record) {
        if (record.getId()==null) {
            registerservice.save(record);
        } else {
            registerservice.update(record);
        }
        return ApiResponse.success();
    }

    @ApiOperation("根据ID删除工作简介")
    @DeleteMapping("/{id}")
    public ApiResponse del(@PathVariable Integer id) {
        if (id == null) {
            return ApiResponse.error("id不能为空");
        }

        registerservice.remove(id);
        return ApiResponse.success();
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询详细信息")
    public ApiResponse<register> selectByPrimaryKey(@PathVariable Integer id) {
        if (id == null) {
            return ApiResponse.error("id不能为空");
        }

        register info = registerservice.getByPrimaryKey(id);
        return ApiResponse.success(info);
    }

    @ApiOperation("查询全部信息")
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public ApiResponse<List<register>> getList(HttpServletRequest request, HttpServletResponse response,@RequestBody register record) {
        /**条件判断**/


        List<register> list = registerservice.getList(record);
        return ApiResponse.success(list);
    }

    @ApiOperation("分页列表")
    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public ApiResponse<PageInfo<register>> pageList(HttpServletRequest request, HttpServletResponse response,@RequestBody PageData<register> record) {
        /**条件判断**/
        PageInfo<register> info = registerservice.pageList(record);
        return ApiResponse.success(info);
    }
}