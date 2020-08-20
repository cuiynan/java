package com.aidoctor.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aidoctor.pojo.Product;
import com.aidoctor.service.ProductService;
import com.common.ReturnResult;
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
 * @date 2020-08-19
 */
@Api(tags = "价格管理")
@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productservice;

    @ApiOperation("创建价格管理")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ReturnResult save(HttpServletRequest request, HttpServletResponse response,Product record) {
        if (record.getId()==null) {
            productservice.insert(record);
        } else {
            productservice.update(record);
        }
        return ReturnResult.ok();
    }

    @ApiOperation("根据ID删除价格管理")
    @DeleteMapping("/{id}")
    public ReturnResult del(@PathVariable String id) {
        if (id == null) {
            return ReturnResult.build("id不能为空");
        }

        productservice.del(id);
        return ReturnResult.ok();
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询详细信息")
    public ReturnResult selectByPrimaryKey(@PathVariable String id) {
        if (id == null) {
            return ReturnResult.build("id不能为空");
        }

        Product info = productservice.selectByPrimaryKey(id);
        return ReturnResult.ok(info);
    }

    @ApiOperation("查询全部信息")
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public ReturnResult getList(HttpServletRequest request, HttpServletResponse response,Product record) {
        /**条件判断**/


        List<Product> list = productservice.getList(record);
        return ReturnResult.ok(list);
    }

    @ApiOperation("分页列表")
    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public ReturnResult pageList(HttpServletRequest request, HttpServletResponse response,Product record,
                                 @RequestParam(value="pageNo",defaultValue = "1")Integer pageNo,
                                 @RequestParam(value="pageSize",defaultValue = "20")Integer pageSize) {
        /**条件判断**/


        PageInfo<Product> info = productservice.pageList(record,pageNo,pageSize);
        return ReturnResult.ok(info);
    }
}