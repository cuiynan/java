package ${Package}.service;


${imports}
import ${Package}.pojo.${T};

/**
 *
 * @author ${author}
<#if version??>
 * @version ${version}
</#if>
 * @date ${creatortime}
 */
public interface ${fileName} {

    void save(${T} record);

    void update(${T} record);

    void remove(<#list newMember as m><#if m.key==true>${m.javaType} ${m.conlumName}</#if></#list>);

    ${T} getByPrimaryKey(<#list newMember as m><#if m.key==true>${m.javaType} ${m.conlumName}</#if></#list>);

    List<${T}> getList(${T} record);

    PageInfo<${T}> pageList(${T} record,Integer pageNo,Integer pageSize);
}