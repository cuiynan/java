package com.aidoctor.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aidoctor.pojo.HLog;
import com.aidoctor.service.HLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 价格管理
 *
 * @author cyn
 * @version v1.0
 * @date 2020-10-27
 */
@Api(tags = "价格管理")
@RestController
@RequestMapping(value = "/hLog")
public class HLogController {
    @Autowired
    private HLogService hlogservice;

    @ApiOperation("创建价格管理")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ApiResponse save(HttpServletRequest request, HttpServletResponse response,HLog record) {
        if (record.getId()==null) {
            hlogservice.save(record);
        } else {
            hlogservice.update(record);
        }
        return ApiResponse.success();
    }

    @ApiOperation("根据ID删除价格管理")
    @DeleteMapping("/{id}")
    public ApiResponse del(@PathVariable Integer id) {
        if (id == null) {
            return ApiResponse.error("id不能为空");
        }

        hlogservice.remove(id);
        return ApiResponse.success();
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询详细信息")
    public ApiResponse<HLog> selectByPrimaryKey(@PathVariable Integer id) {
        if (id == null) {
            return ApiResponse.error("id不能为空");
        }

        HLog info = hlogservice.getByPrimaryKey(id);
        return ApiResponse.success(info);
    }

    @ApiOperation("查询全部信息")
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public ApiResponse<List<HLog>> getList(HttpServletRequest request, HttpServletResponse response,HLog record) {
        /**条件判断**/


        List<HLog> list = hlogservice.getList(record);
        return ApiResponse.success(list);
    }

    @ApiOperation("分页列表")
    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public ApiResponse<PageInfo<HLog>> pageList(HttpServletRequest request, HttpServletResponse response,HLog record,
                                 @RequestParam(value="pageNo",defaultValue = "1")Integer pageNo,
                                 @RequestParam(value="pageSize",defaultValue = "20")Integer pageSize) {
        /**条件判断**/


        PageInfo<HLog> info = hlogservice.pageList(record,pageNo,pageSize);
        return ApiResponse.success(info);
    }
}