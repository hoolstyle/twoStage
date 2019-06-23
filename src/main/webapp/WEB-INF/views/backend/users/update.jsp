<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lipengpeng
  Date: 2019/6/12
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>用户后台2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/js/xadmin.js"></script>
    <script src="/js/My97DatePicker/WdatePicker.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form" method="post">
        <input type="hidden" name="userId" value="${user.userId}">
        <div class="layui-form-item">
            <label for="username" class="layui-form-label">
                <span class="x-red">*</span>用户名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="username" name="userName"
                       value="${user.userName}" required="" lay-verify="userName"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>将会成为您唯一的登录名
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"><span class="x-red">*</span>角色</label>
            <div class="layui-input-block">
                <c:if test="${user.roleId==1}">
                <input type="radio" name="roleId" value="1" checked="checked" lay-skin="primary" title="超级管理员">
                <input type="radio" name="roleId" value="0"  lay-skin="primary" title="普通会员">
                </c:if>
                <c:if test="${user.roleId==0}">
                    <input type="radio" name="roleId" value="1"  lay-skin="primary" title="超级管理员">
                    <input type="radio" name="roleId" value="0" checked="checked" lay-skin="primary" title="普通会员">
                </c:if>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_pass" class="layui-form-label">
                <span class="x-red">*</span>密码
            </label>
            <div class="layui-input-inline">
                <input type="password" id="L_pass" name="userPsw"
                      value="${user.userPsw}" required="" lay-verify="pass"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                6到16个字符
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">
            </label>
            <button  class="layui-btn" lay-filter="update" lay-submit="">
                修改
            </button>
        </div>
    </form>
</div>
<script>
    <%--<c:if test="${msg !=null }">--%>
    <%--alert('${msg}');--%>
    <%--</c:if>--%>
    // layui前端框架会动态的加载插件
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;

        //自定义验证规则
        form.verify({
            userName: function(value){
                if(value.length < 3){
                    return '用户名至少得3个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
        });

        //监听提交
        form.on('submit(update)', function(data){
            console.log(data);
            //发异步，把数据提交给php java .net
            $.ajax({
                url:"/backend/users/update",
                type:"post",
                data:data.field,
                dataType:"json",
                success:function (r) {
                        if(r.status==1){
                        layer.alert(r.msg, {icon: 1},function () {
                            /*   // 获得frame索引
                               // 获取弹出窗口的索引
                               var index = parent.layer.getFrameIndex(window.name);
                               //关闭当前frame
                               parent.layer.close(index);*/
                           /* 刷新父页面*/
                            parent.location.reload();
                        });
                        }else {
                            layer.alert(r.msg, {icon: 2});
                        }
                }
            })

            return false;
        });


    });
</script>
</body>

</html>

