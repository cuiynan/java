package ${Package}.pojo;

${imports}
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
*
* @author ${author}
<#if version??>
    * @version ${version}
</#if>
* @date ${creatortime}
*/
@ApiModel("${describe}")
@Data
@Accessors(chain = true)
public class ${fileName} {
<#list newMember as m>

    /**${m.commentName}**/
    @ApiModelProperty(value = "${m.commentName}")
    <#if underline==true>
        private ${m.javaType} ${m.humpConlumName ? uncap_first};
    <#else>
        private ${m.javaType} ${m.conlumName ? uncap_first};
    </#if>
</#list>

}