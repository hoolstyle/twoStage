<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 86561
  Date: 2019/6/19
  Time: 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/backend/css/font.css">
    <link rel="stylesheet" href="/backend/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/backend/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/backend/js/xadmin.js"></script>
    <script src="/backend/js/jquery-3.2.1.min.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <input type="hidden" name="postsid" value="${uppo.postsid}">
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>标题
            </label>
            <div class="layui-input-inline">
                <input type="text" id="poststitle" name="poststitle" required="" lay-verify="required"
                       autocomplete="off" value="${uppo.poststitle}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>内容
            </label>
            <div class="layui-input-inline">
                <input type="text" id="postscontent" name="postscontent" required="" lay-verify="required"
                       autocomplete="off" value="${uppo.postscontent}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>时间
            </label>
            <div class="layui-input-inline">
                <input type="text"  name="releasetime" required=""
                       lay-verify="required"
                       value="<fmt:formatDate value="${uppo.releasetime}" pattern="yyyy-MM-dd HH:mm:ss"/> "
                       class="layui-input"  id="test5" placeholder="yyyy-MM-dd HH:mm:ss">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>点赞数
            </label>
            <div class="layui-input-inline">
                <input type="text" id="likenumint" name="likenumint" required="" lay-verify="required"
                       autocomplete="off" value="${uppo.likenumint}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>热度
            </label>
            <div class="layui-input-inline">
                <input type="text" id="postsheat" name="postsheat" required="" lay-verify="required"
                       autocomplete="off" value="${uppo.postsheat}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>帖子类型
            </label>
            <div class="layui-input-block">
                <select lay-verify="required" name="poststype" lay-filter="column">
                    <c:forEach items="${poty}" var="item" varStatus="S" >
                        <c:if test="${item != null}">
                            <option value="${item.typeid}" selected = ${item.typeid}==${uppo.poststype}?"selected":"">${item.typename}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="x-red">*</span>状态
            </label>
            <div class="layui-input-block">
                <select lay-verify="required" name="state" lay-filter="column">
                    <c:forEach items="${sta}" var="item" varStatus="S" >
                        <c:if test="${item.stateid==uppo.state}">
                            <option value="${item.stateid}" selected="selected">${item.statename}</option>
                        </c:if>
                        <c:if test="${item.stateid!=uppo.state}">
                            <option value="${item.stateid}">${item.statename}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label  class="layui-form-label">
            </label>
            <button  class="layui-btn" lay-filter="add" lay-submit="">
                修改
            </button>
        </div>
    </form>
</div>
<script>

    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#test5' //指定元素
            ,type: 'datetime'
        });

        /*//执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
            ,type: 'datetime'
        });*/
    });


    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;

        //自定义验证规则
      /*  form.verify({
            nikename: function(value){
                if(value.length < 5){
                    return '昵称至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
        });
*/
        //监听提交
        form.on('submit(add)', function(data){
            console.log(data.field);
            //发异步，把数据提交给php
            $.ajax({
                url:"/ups",
                type:"post",
                data:JSON.stringify(data.field),
                contentType:"application/json",
                dataType:"json",
                success:function (r) {
                    if(r==1){
                        layer.alert("修改成功", {icon: 6},function () {
                            parent.location.reload();
                        });
                    }else {
                        layer.alert("修改失败", {icon: 5},function () {
                            parent.location.reload();
                        });
                    }
                }
            })
            return false;
        });


    });
</script>
<script>var _hmt = _hmt || []; (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</body>

</html>
