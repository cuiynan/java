<template>
    <div class="box">
        <div class="pageTitle" v-if="mainFlag">
            <h6>{{$utils.selectMenu($route.path)}}</h6>
            <span class="searchBtn" @click="addTableList" v-if="BtnFlag.addFlag">新建数据</span>
        </div>
        <div class="main" v-if="mainFlag">
            <div class="searchHead">
                <div class="searchTitle">
                    <h6>筛选条件</h6>
                    <div class="btnBox">
                        <span class="searchBtn" @click="search">查 询</span>
                        <span class="resetBtn" @click="reset">重 置</span>
                    </div>
                </div>
                <div class="searchBox">
                    <div class="inputBox">
                        <span class="inputTitle">类别编码：</span>
                        <a-input placeholder="请输入" v-model="dictionariesCode"/>
                    </div>
                    <div class="inputBox">
                        <span class="inputTitle">类别值：</span>
                        <a-input placeholder="请输入" v-model="dictionariesValue"/>
                    </div>
                </div>
            </div>

            <div class="searchMain">
                <div class="searchTitle">
                    <h6>筛选结果 </h6>
                    <div class="btnBox">
                        <!-- <span class="resetBtn"><img src="../../../static/img/daoru@3x.png" alt=""> 导 入</span> -->
                    </div>
                </div>
                <div class="searchTable">

                    <a-table v-loading="loading" :columns="columns" :data-source="dataList.records"
                             :scroll="{x:'max-content' }" :pagination='false'>
                        <template slot="status" slot-scope="status">
							<span>
								<b v-if="status==0"
                                   style="vertical-align: middle;font-size: 12px;color:rgba(15,42,80,0.60);"> <i
                                            style="margin-bottom:2px;display: inline-block;width: 8px;height: 8px;border-radius: 50%;background: #52C41A;vertical-align: middle;"></i> 正常</b>
								<b v-if="status==1"
                                   style="vertical-align: middle;font-size: 12px;color:rgba(15,42,80,0.60);"> <i
                                            style="margin-bottom:2px;display: inline-block;width: 8px;height: 8px;border-radius: 50%;background: #F5222D;vertical-align: middle;"></i> 停用</b>
							</span>
                        </template>
                        <template slot="operation" slot-scope="text, record" v-if="BtnFlag.editFlag">
							<span>
								<a @click="uploadTableList(record)">修改</a>
                                <!-- <a @click="closeStatic(record)">停用</a> -->
							</span>
                        </template>
                    </a-table>
                    <div class="page">
                        <Pagination :total="dataList.total" show-size-changer :current="page*1" @change="pageChange"
                                    @showSizeChange="showSizeChange	"/>
                        <ul class="pageInput">跳转至 <input type="text" v-model="page" @blur="blurPage" @focus="focusFN"
                                                         @keyup.enter="focusPage($event)"> 页
                        </ul>
                    </div>
                </div>
            </div>

        </div>
        <!-- 添加数据 -->
        <div class="pageTitle" v-if="addBtnFlag">
            <h6>新建数据</h6>
            <div class="btnBox">
                <span class="searchBtn" @click="addLlist">提 交</span>
                <span class="resetBtn" @click="()=>{addBtnFlag=false;mainFlag=true}">取 消</span>
            </div>
        </div>
        <div class="main" v-if="addBtnFlag">
            <div class="addMain"><#list newMember as m> <#if m.key==true>
                    <div class="inputBox"><span><b class="Btitle">* </b><#else><div class="inputBox"><span></#if>${m.commentName}</span>
                    <a-input placeholder="请输入"
                             v-model="<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>"/>
                     </div>
                </#list>
            </div>
        </div>
    </div>
</template>
<script>

    const columns = [
        <#list newMember as m>
        {title: '${m.commentName}', dataIndex: '<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>', key: '<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>', align: 'left'},
        </#list>
        {
            title: '操作',
            key: 'action',
            dataIndex: 'action',
            fixed: 'right',
            width: 180,
            align: 'center',
            scopedSlots: {customRender: 'operation'}
        },
    ];
    import {Table, Input, Pagination} from 'ant-design-vue';
    import 'ant-design-vue/dist/antd.css';

    export default {
        data() {
            return {
                dataList: "",
                columns,
                page: 1,
                pageSize: 10,
                dictionariesCode: "",
                dictionariesValue: "",
                dictionariesTypeDesc: "",
                dictionariesParam1: "",
                dictionariesParam2: "",
                mainFlag: true,
                addBtnFlag: false,
                uploadBtnFlag: false,
                selectStatusData: 0,
                uploadData: {},
                focusData: 1,
                BtnFlag: {},
                <#list newMember as m>
                "<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>": "",
                </#list>
                loading: false,

            }
        },
        components: {
            ATable: Table,
            AInput: Input,
            Pagination: Pagination
        },
        methods: {
            // 提交
            uploadList() {
                if (this.uploadData.code == "" || this.uploadData.value == "" || this.uploadData.typeDesc == "") {
                    this.$message({
                        type: 'warning',
                        message: '请输入必填项'
                    })
                    return;
                }

                <#list newMember as m>
                this.uploadData.<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>= this.$utils.trim(this.uploadData.<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>);
                    </#list>

                this.$post(this.url + this.hostTech + '/${Controller}/updateById', this.uploadData).then((result) => {
                    if(result.message == '请求成功'){
                    this.uploadBtnFlag = false
                    this.mainFlag = true
                    this.$message({
                        type: 'success',
                        message: '修改成功!'
                    });
                    this.initData({
                        "capacity": this.pageSize,
                        "page": this.page,
                        "records": [{
                            "code": this.dictionariesCode,
                            "typeDesc": this.dictionariesTypeDesc,
                            "value": this.dictionariesValue
                        }]
                    })
                }
            else
                {
                    this.$message({
                        type: 'warning',
                        message: result.response.desc
                    })
                }
            }).
                catch((err) => {
                    console.log(err)
                });
            },
            // 修改
            uploadTableList(record) {
                this.uploadBtnFlag = true
                this.mainFlag = false

                this.$get(this.url + this.hostTech + '/${Controller}/' + record.id).then((result) => {
                    if(result.message == '请求成功'){
                    this.uploadData = result.data
                }
            else{
                    this.$message({
                        type: 'warning',
                        message: result.response.desc
                    })
                }
            }).
                catch((err) => {
                    console.log(err)
                });
            },

            // 新建提交
            addLlist() {
                var data = {

                    <#list newMember as m>
                    "<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>": this.<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if>,
                    </#list>
                }
                if (this.dictionariesCode == "" || this.dictionariesTypeDesc == "" || this.dictionariesValue == "") {
                    this.$message({
                        type: 'warning',
                        message: '请输入必填项'
                    })
                    return;
                }

                this.$post(this.url + this.hostTech + '/${Controller}/create', data).then((result) => {
                    if(result.message == '请求成功'){
                    this.dictionariesCode = "";
                    this.dictionariesValue = "";
                    this.addBtnFlag = false
                    this.mainFlag = true
                    this.$message({
                        type: 'success',
                        message: '添加成功'
                    })
                    this.initData({
                        "capacity": this.pageSize,
                        "page": this.page,
                        "records": [{
                            "code": this.dictionariesCode,
                            "typeDesc": this.dictionariesTypeDesc,
                            "value": this.dictionariesValue
                        }]
                    })
                }
            else
                {
                    this.$message({
                        type: 'warning',
                        message: result.response.desc
                    })
                }
            }).
                catch((err) => {
                    console.log(err)
                });
            },
            selectStatus(value) {
            },
            // 新建
            addTableList() {
                <#list newMember as m>
                this.<#if underline==true>${m.humpConlumName? uncap_first}<#else>${m.conlumName? uncap_first}</#if> = "";
                </#list>
            },
            // 重置
            reset() {
                this.dictionariesCode = "";
                this.dictionariesValue = "";
                this.page = 1
                this.initData({
                    "capacity": this.pageSize,
                    "page": this.page,
                    "records": [{
                        "code": '',
                        "typeDesc": '',
                        "value": ''
                    }]
                })
            },
            // 搜索
            search() {
                this.page = 1
                this.dictionariesValue = this.$utils.trim(this.dictionariesValue);
                this.dictionariesTypeDesc = this.$utils.trim(this.dictionariesTypeDesc);
                this.dictionariesCode = this.$utils.trim(this.dictionariesCode);

                this.initData({
                    "capacity": this.pageSize,
                    "page": 1,
                    "records": [{
                        "code": this.dictionariesCode,
                        "typeDesc": this.dictionariesTypeDesc,
                        "value": this.dictionariesValue
                    }]
                })
            },
            // 分页
            focusFN() {
                this.focusData = this.page
            },
            // 分页
            focusPage(event) {
                if (this.page <= 0) {
                    this.page = this.focusData
                }
                if (this.page > this.dataList.pageCount) {
                    this.page = this.focusData
                }
                this.initData({
                    "capacity": this.pageSize,
                    "page": this.page,
                    "records": [{
                        "code": this.dictionariesCode,
                        "typeDesc": this.dictionariesTypeDesc,
                        "value": this.dictionariesValue
                    }]
                })
            },
            // 分页
            blurPage() {
                if (this.page <= 0) {
                    this.page = this.focusData
                }
                if (this.page > this.dataList.pageCount) {
                    this.page = this.focusData
                }
                this.initData({
                    "capacity": this.pageSize,
                    "page": this.page,
                    "records": [{
                        "code": this.dictionariesCode,
                        "typeDesc": this.dictionariesTypeDesc,
                        "value": this.dictionariesValue
                    }]
                })
            },
            // 分页
            pageChange(page, pageSize) {
                this.pageSize = pageSize
                this.page = page
                this.initData({
                    "capacity": pageSize,
                    "page": page,
                    "records": [{
                        "code": this.dictionariesCode,
                        "typeDesc": this.dictionariesTypeDesc,
                        "value": this.dictionariesValue
                    }]
                })
            },
            // 分页
            showSizeChange(current, size) {
                this.pageSize = size
                this.page = current
                this.initData({
                    "capacity": size,
                    "page": current,
                    "records": [{
                        "code": this.dictionariesCode,
                        "typeDesc": this.dictionariesTypeDesc,
                        "value": this.dictionariesValue
                    }]
                })
            },
            // 初始化数据
            initData(data) {
                this.loading = true
                this.$post(this.url + this.hostTech +  '/${Controller}/queryList', data).then((result) => {
                    this.loading = false
                    if(result.message == '请求成功' ){
                        this.dataList = result.data
                     }
            else
                {
                    this.$message({
                        type: 'warning',
                        message: result.response.desc
                    })
                }
            }).
                catch((err) => {
                    console.log(err)
                }
            )
                ;
            },
        },
        mounted() {
            var data = {
                "capacity": 10,
                "page": 1,
                "records": [
                    {

                    }
                ]
            };
            // 按钮权限
            this.$utils.testBtn(this).then(res => {
                this.BtnFlag = res
            }
        )
            this.initData(data)
        }
    }
</script>


<style lang="less" scoped>
    .box{
        width: 100%;
    }
    .main{
        padding: 30px 30px 0 30px;
    .searchHead{
        background: #fff;
        margin-bottom:24px;
    }

    .searchBox{
        width: 100%;
        padding: 16px 32px 24px 0px;
        box-sizing: border-box;
        display: flex;
        align-items: center;
        flex-wrap: wrap;
    .inputBox{
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top: 8px;
        margin-left: 24px;
    .inputTitle{
        width: 100px;
        text-align: right;
        font-family: PingFangSC-Regular;
        font-size: 14px;
        color: #0F2A50;
    }
    span{
        font-family: PingFangSC-Regular;
        font-size: 14px;
        color: #0F2A50;
    }
    .ant-input{
        width: 220px;
        height: 30px;
    }
    }
    }
    }

    .searchTitle{
        height: 55px;
        line-height: 55px;
        border-bottom: 1px solid #E8E8E8;
        padding-left: 30px;
        padding-right: 30px;
        box-sizing: border-box;
        background: #fff;
    h6{
        float: left;
        line-height: 55px;
        font-family: PingFangSC-Medium;
        font-size: 16px;
        color: #0F2A50;
        margin-bottom: 0;
    img{
        width: 18px;
        height: 18px;
    }
    }
    .btnBox{
        float: right;
    .searchBtn{
        height: 32px;
        line-height: 32px;
        padding-left: 16px;
        padding-right: 16px;
        box-sizing: border-box;
        text-align: center;
        display: inline-block;
        font-family: PingFangSC-Regular;
        font-size:14px;
        color: #FFFFFF;
        background: #0D6FB8;
        border-radius: 4px;
        border-radius: 4px;
    }
    }
    }
    .searchTable{
        padding: 30px;
        box-sizing: border-box;
        background: #fff;
    }
    .page{
        display: flex;
        align-items: center;
        justify-content: flex-end;
        margin-top: 10px;
        width: 100%;
        height: 35px;
        line-height: 35px;
        background: #fff;
    .pageInput{
        margin-top: 25px;
    input{
        width: 50px;
        height: 33px;
        padding-left: 10px;
        padding-right: 10px;
    }
    }
    }
    .ant-pagination{
        float: right;
        margin-top: 10px;
    }
    .resetBtn{
        padding-left: 16px;
        padding-right: 16px;
        box-sizing: border-box;
        height: 32px;
        line-height: 32px;
        text-align: center;
        display: inline-block;
        font-family: PingFangSC-Regular;
        font-size:14px;
        border-radius: 4px;
        border-radius: 4px;
        color: #0F2A50;
        border: 1px solid #D9D9D9;
    img{
        width:14px;
        height:14px;
    }
    }
    .addMain{
        background: #fff;
        padding: 30px 48px ;
        box-sizing: border-box;
        display: flex;
        flex-wrap: wrap;
    .inputBox{
        min-width: 30%;
        display: flex;
        align-items: center;
        margin-top: 32px;
    span{
        width: 90px;
        font-family: PingFangSC-Regular;
        font-size:14px;
        color: #0F2A50;
        text-align: right;
    }
    .ant-input{
        width: 220px;
        height: 30px;
    }
    }
    }
</style>