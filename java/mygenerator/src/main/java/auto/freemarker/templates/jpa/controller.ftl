<#if classPath??>
package ${classPath};
</#if>

${imports}
import ${Package}.pojo.${T};
import ${Package}.service.${Service};
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
 * ${describe}
 *
 * @author ${author}
<#if version??>
 * @version ${version}
</#if>
 * @date ${creatortime}
 */
@Api(tags = "${describe}")
@RestController
@RequestMapping(value = "/${Controller}")
public class ${fileName} {
    @Autowired
    private ${Service} ${Service ? lower_case};

    @ApiOperation("创建${describe}")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ReturnResult save(HttpServletRequest request, HttpServletResponse response,${T} record) {
        if (record.get<#list newMember as m><#if m.key==true><#if underline==true>${m.humpConlumName ? cap_first}<#else>${m.conlumName ? cap_first}</#if></#if></#list>()==null) {
            ${Service ? lower_case}.insert(record);
        } else {
            ${Service ? lower_case}.update(record);
        }
        return ReturnResult.ok();
    }

    @ApiOperation("根据ID删除${describe}")
    @DeleteMapping("/{id}")
    public ReturnResult del(@PathVariable <#list newMember as m><#if m.key==true>${m.javaType} id</#if></#list>) {
        if (id == null) {
            return ReturnResult.build("id不能为空");
        }

        ${Service ? lower_case}.del(id);
        return ReturnResult.ok();
    }

    @GetMapping("/{id}")
    @ApiOperation("根据ID查询详细信息")
    public ReturnResult selectByPrimaryKey(@PathVariable <#list newMember as m><#if m.key==true>${m.javaType} id</#if></#list>) {
        if (id == null) {
            return ReturnResult.build("id不能为空");
        }

        ${T} info = ${Service ? lower_case}.selectByPrimaryKey(id);
        return ReturnResult.ok(info);
    }

    @ApiOperation("查询全部信息")
    @RequestMapping(value = "/queryList", method = RequestMethod.POST)
    public ReturnResult getList(HttpServletRequest request, HttpServletResponse response,${T} record) {
        /**条件判断**/


        List<${T}> list = ${Service ? lower_case}.getList(record);
        return ReturnResult.ok(list);
    }

    @ApiOperation("分页列表")
    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public ReturnResult pageList(HttpServletRequest request, HttpServletResponse response,${T} record,
                                 @RequestParam(value="pageNo",defaultValue = "1")Integer pageNo,
                                 @RequestParam(value="pageSize",defaultValue = "20")Integer pageSize) {
        /**条件判断**/


        PageInfo<${T}> info = ${Service ? lower_case}.pageList(record,pageNo,pageSize);
        return ReturnResult.ok(info);
    }
}