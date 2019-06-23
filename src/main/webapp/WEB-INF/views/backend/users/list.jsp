<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lipengpeng
  Date: 2019/6/11
  Time: 15:23
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
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>用户信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so"
         action="/backend/users/list" method="post">
            <input type="hidden" name="pageNum">
            <input class="layui-input" placeholder="开始日" name="startTime"
                   value="<fmt:formatDate value="${p.ns.startTime}" pattern="yyyy-MM-dd"/>" id="start">
            <input class="layui-input" placeholder="截止日" name="endTime"
                   value="<fmt:formatDate value="${p.ns.endTime}" pattern="yyyy-MM-dd"/>" id="end">
            <input type="text" name="userName" value="${p.ns.userName}"  placeholder="请输入用户名" autocomplete="off" class="layui-input">
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加用户','add')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：${p.total } 条</span>
    </xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>序号</th>
            <th>用户名</th>
            <th>用户密码</th>
            <th>创建时间</th>
            <th>角色</th>
            <th>状态</th>
            <th>操作</th>
        </thead>
        <tbody>
        <c:forEach items="${p.list}" var="ls" varStatus="S">
            <tr>
                <td>
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='${ls.userId}'><i class="layui-icon">&#xe605;</i></div>
                </td>
                <td>${S.count}</td>
                <td>${ls.userName}</td>
                <td>${ls.userPsw}</td>
                <td>
                    <fmt:formatDate value="${ls.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
                </td>
                <td>
                    <c:if test="${ls.roleId==1}">
                        管理员
                    </c:if>
                    <c:if test="${ls.roleId==0}">
                        普通用户
                    </c:if>
                </td>
                <td>${ls.flag}</td>
                <td class="td-status">
                    <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
                <td class="td-manage">
                    <a onclick="member_stop(this,'10001')" href="javascript:;"  title="启用">
                        <i class="layui-icon">&#xe601;</i>
                    </a>
                    <a title="编辑"  onclick="x_admin_show('编辑','update/${ls.userId}')" href="javascript:;">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="member_del(this,${ls.userId})" >
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%--把分页插件动态插入当前位置--%>
    <%@include file="../../page.jsp"%>
    <%--<div class="page">--%>
        <%--<p>当前 ${p.pageNum}页,总${p.totalPage}页,总 ${p.total } 条记录</p>--%>
        <%--<a href="list?pageNum=1">第一页</a>--%>
        <%--<c:if test="${p.pageNum>1}">--%>
            <%--<a href="list?pageNum=${p.pageNum-1}">上一页</a>--%>
        <%--</c:if>--%>
        <%--<c:if test="${p.pageNum<p.totalPage }">--%>
            <%--<a href="list?pageNum=${p.pageNum+1}">下一页</a>--%>
        <%--</c:if>--%>
        <%--<a href="list?pageNum=${p.totalPage}">最后页</a>--%>
    <%--</div>--%>
</div>
<script>
    <%--<c:if test="${msg !=null }">--%>
    <%--alert('${msg}');--%>
    <%--</c:if>--%>

    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

    /*用户-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要停用吗？',function(index){

            if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

            }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
            }

        });
    }

    /*用户-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(){
            //同步请求
            // location.href="/backend/users/del/"+id;
            //发异步删除数据
            $.ajax({
                url:"/backend/users/del2/"+id,
                type:"get",
                dataType:"json",
                success:function (r) {
                    if(r==1){
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!',{icon:1,time:1000});
                    }else {
                        layer.msg('删除失败!',{icon:2,time:1000});
                    }
                }
            })

        });
    }



    function delAll (argument) {

        var data = tableCheck.getData();

        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            $.ajax({
                url:"delAll",
                type:"post",
                data:JSON.stringify(data),
                dataType:"json",
                contentType:"application/json",
                success:function (r) {
                    if(r==1){
                        layer.msg('删除成功', {icon: 1,time:1000});
                        $(".layui-form-checked").not('.header').parents('tr').remove();
                        // location.reload();
                    }else {
                        layer.msg('删除失败', {icon: 2,time:1000});
                    }
                }
            })
        });
    }
</script>
</body>

</html>

