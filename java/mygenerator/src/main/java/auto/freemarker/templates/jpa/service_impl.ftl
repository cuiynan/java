package ${Package}.service.impl;

import ${Package}.pojo.${T};
import ${Package}.mapper.${Mapper};
import ${Package}.service.${Service};
${imports}

/**
 *
 * @author ${author}
<#if version??>
 * @version ${version}
</#if>
 * @date ${creatortime}
 */
@Service
public class ${fileName} implements ${Service} {
    @Autowired
    private ${Mapper} ${Mapper ? uncap_first};

    @Override
    public void save(${T} record) {
        ${Mapper ? uncap_first}.insert(record);
    }

    @Override
    public void update(${T} record){
        ${Mapper ? uncap_first}.update(record);
    }

    @Override
    public void remove(<#list newMember as m><#if m.key==true>${m.javaType} id</#if></#list>){
        ${Mapper ? uncap_first}.del(id);
    }

    @Override
    public ${T} getByPrimaryKey(<#list newMember as m><#if m.key==true>${m.javaType} id</#if></#list>){
        return ${Mapper ? uncap_first}.selectByPrimaryKey(id);
    }

    @Override
    public List<${T}> getList(${T} record){
        return ${Mapper ? uncap_first}.selectByRecord(record);
    }

    @Override
    public PageInfo<${T}> pageList( PageData<${T}> page){
        PageHelper.startPage(page.getPage(), page.getCapacity());
        List<${T}> list = ${Mapper ? uncap_first}.selectByRecord(page.getRecords().get(0));
        return new PageInfo<>(list);
    }

}