<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86561
  Date: 2019/6/17
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>发表问题 编辑问题 公用</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
    <link rel="stylesheet" href="/fly-3.0/res/layui/css/layui.css">
    <link rel="stylesheet" href="/fly-3.0/res/css/global.css">

</head>
<body>

<div class="fly-header layui-bg-black">
    <div class="layui-container">
        <a class="fly-logo" href="fronts">
            <img src="/fly-3.0/res/images/logo.png" alt="layui">
        </a>

        <ul class="layui-nav fly-nav-user">

            <!-- 未登入的状态 -->
            <!--
            <li class="layui-nav-item">
              <a class="iconfont icon-touxiang layui-hide-xs" href="user/login.html"></a>
            </li>
            <li class="layui-nav-item">
              <a href="user/login.html">登入</a>
            </li>
            <li class="layui-nav-item">
              <a href="user/reg.html">注册</a>
            </li>
            <li class="layui-nav-item layui-hide-xs">
              <a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
            </li>
            <li class="layui-nav-item layui-hide-xs">
              <a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
            </li>
             -->

            <!-- 登入后的状态 -->
            <li class="layui-nav-item">
                <a class="fly-nav-avatar" href="javascript:;">
                    <cite class="layui-hide-xs">贤心</cite>
                    <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 作者"></i>
                    <i class="layui-badge fly-badge-vip layui-hide-xs">VIP3</i>
                    <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg">
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="/fly-3.0/html/user/set.html"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
                    <dd><a href="/fly-3.0/html/user/message.html"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
                    <dd><a href="/fly-3.0/html/user/home.html"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
                    <hr style="margin: 5px 0;">
                    <dd><a href="" style="text-align: center;">退出</a></dd>
                </dl>
            </li>
        </ul>
    </div>
</div>

<div class="layui-container fly-marginTop">
    <div class="fly-panel" pad20 style="padding-top: 5px;">
        <!--<div class="fly-none">没有权限</div>-->
        <div class="layui-form layui-form-pane">
            <div class="layui-tab layui-tab-brief" lay-filter="user">
                <ul class="layui-tab-title">
                    <li class="layui-this">发表新帖<!-- 编辑帖子 --></li>
                </ul>
                <div class="layui-form layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                    <div class="layui-tab-item layui-show">
                        <form action="/issue" method="post" enctype="multipart/form-data">
                            <div class="layui-row layui-col-space15 layui-form-item">
                                <div class="layui-col-md3">
                                    <label class="layui-form-label">所在专栏</label>
                                    <div class="layui-input-block">
                                    <select lay-verify="required" name="poststype" lay-filter="column">
                                        <option></option>
                                        <c:forEach items="${selects}" var="item" varStatus="S" >
                                            <c:if test="${item != null}">
                                                <option value="${item.typeid}">${item.typename}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                                </div>
                                <div class="layui-col-md9">
                                    <label for="L_title" class="layui-form-label">标题</label>
                                    <div class="layui-input-block">
                                        <input type="text" id="L_title" name="poststitle" required lay-verify="required" autocomplete="off" class="layui-input">
                                        <!-- <input type="hidden" name="id" value="{{d.edit.id}}"> -->
                                    </div>
                                </div>



                                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
                                    <legend>添加图片</legend>
                                </fieldset>
                                <input type="hidden" id="upicture" value="" name="picture">
                                <div class="layui-upload">
                                    <button type="button"  class="layui-btn" id="test2" >图片上传</button>
                                    <blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;">
                                        预览图：
                                        <div class="layui-upload-list" id="demo2"></div>
                                    </blockquote>
                                </div>


                            </div>

                            <div class="layui-form-item layui-form-text">
                                <div class="layui-input-block">
                                    <textarea id="L_content" name="postscontent" required lay-verify="required" placeholder="详细描述" class="layui-textarea fly-editor" style="height: 260px;"></textarea>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <button class="layui-btn" lay-filter="*" lay-submit>立即发布</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="fly-footer">
    <p><a href="http://fly.layui.com/" target="_blank">Fly社区</a> 2017 &copy; <a href="http://www.layui.com/" target="_blank">layui.com 出品</a></p>
    <p>
        <a href="http://fly.layui.com/jie/3147/" target="_blank">付费计划</a>
        <a href="http://www.layui.com/template/fly/" target="_blank">获取Fly社区模版</a>
        <a href="http://fly.layui.com/jie/2461/" target="_blank">微信公众号</a>
    </p>
</div>

<script src="/fly-3.0/res/layui/layui.js"></script>
<script src="/backend/js/jquery-3.2.1.min.js"></script>

<script>

    layui.config({
        version: "3.0.0"
        ,base: '/fly-3.0/res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');

    layui.use('upload', function(){
        var $ = layui.jquery
            ,upload = layui.upload;
    //多图片上传
    upload.render({
        elem: '#test2'
        ,url: '/upload/'
        ,multiple: true
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#demo2').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img">')
            });
        }
        ,done: function(posts){
            //上传完毕
            $("#upicture").val( posts.picture);
            document.getElementById("upicture").value = posts.picture;
        }
    });

    });

</script>

</body>
</html>