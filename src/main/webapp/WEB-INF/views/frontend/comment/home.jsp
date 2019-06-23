<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 86561
  Date: 2019/6/17
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>基于 layui 的极简社区页面模版</title>
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
        <ul class="layui-nav fly-nav layui-hide-xs">
            <li class="layui-nav-item layui-this">
                <a href="fronts"><i class="iconfont icon-jiaoliu"></i>交流</a>
            </li>
        </ul>

        <ul class="layui-nav fly-nav-user">

            <!-- 未登入的状态 -->
            <li class="layui-nav-item">
                <a class="iconfont icon-touxiang layui-hide-xs" href="/fly-3.0/html/user/login.html"></a>
            </li>
            <li class="layui-nav-item">
                <a href="/fly-3.0/html/user/login.html">登入</a>
            </li>
            <li class="layui-nav-item">
                <a href="/fly-3.0/html/user/reg.html">注册</a>
            </li>
            <li class="layui-nav-item layui-hide-xs">
                <a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
            </li>
            <li class="layui-nav-item layui-hide-xs">
                <a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
            </li>

        </ul>
    </div>
</div>

<div class="fly-panel fly-column">
    <div class="layui-container">
        <ul class="layui-clear">
            <li class="layui-hide-xs"><a href="fronts">首页</a></li>
            <li class="layui-this"><a href="fronts">提问</a></li>
            <li><a href="">公告<span class="layui-badge-dot"></span></a></li>
            <!-- 用户登入后显示 -->
        </ul>

        <div class="fly-column-right layui-hide-xs">
            <span class="fly-search"><i class="layui-icon"></i></span>
            <a href="/frontsR" class="layui-btn">发表新帖</a>
        </div>
        <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;">
            <a href="/frontsR" class="layui-btn">发表新帖</a>
        </div>
    </div>
</div>

<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8">
            <div class="fly-panel" style="margin-bottom: 0;">

                <div class="fly-panel-title fly-filter">
                    <a href="" class="layui-this">综合</a>
                    <span class="fly-mid"></span>
                    <span class="fly-filter-right layui-hide-xs">
            <a href="" class="layui-this">按最新</a>
          </span>
                </div>

                <ul class="fly-list">
                    <c:forEach items="${p.list}" var="item" varStatus="S">
                    <li>
                        <a href="/fly-3.0/html/user/home.html" class="fly-avatar">
                            <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" alt="贤心">
                        </a>
                        <h2>
                            <a class="layui-badge">${item.postType.typename}</a>
                            <a href="frontsW?fmg=${item.postsid}">${item.poststitle}</a>
                        </h2>
                        <div class="fly-list-info">
                            <a href="/fly-3.0/html/user/home.html" link>
                                <cite>${item.user.userName}</cite>
                                <!--
                                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                                <i class="layui-badge fly-badge-vip">VIP3</i>
                                -->
                            </a>
                            <span>
                                <fmt:formatDate value="${item.releasetime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                            </span>
                            <!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
                            <span class="fly-list-nums">
                <i class="iconfont icon-pinglun1" title="回答"></i> ${item.commentid}
              </span>
                        </div>
                        <%--<div class="fly-list-badge">
                            <span class="layui-badge layui-bg-black">置顶</span>
                            <!--<span class="layui-badge layui-bg-red">精帖</span>-->
                        </div>--%>
                    </li>
                    </c:forEach>
                </ul>

                <!-- <div class="fly-none">没有相关数据</div> -->

                <div style="text-align: center">
                    <div class="laypage-main">

                        <a href="javascript:go(1);" class="laypage-next">&lt;&lt;</a>
                        <c:forEach items="${p.numList}" var="item">
                            <c:if test="${item==p.pageNum}">
                                <span class="laypage-curr">${item}</span>
                            </c:if>
                            <c:if test="${item!=p.pageNum}">
                                <a href="javascript:go(${item});" class="num">${item} </a>
                            </c:if>
                        </c:forEach>
                        <a href="javascript:go(${p.totalPage});" class="laypage-last" title="尾页">尾页</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <dl class="fly-panel fly-list-one">
                <dt class="fly-panel-title">本周热议</dt>
                <c:forEach items="${li}" var="item" varStatus="S">
                <dd>
                    <a href="frontsW?fmg=${item.postsid}">${item.postscontent}</a>
                    <span><i class="iconfont icon-pinglun1"></i> ${item.commentid}</span><br/><br/>
                </dd>
                </c:forEach>
                <!-- 无数据时 -->
                <!--
                <div class="fly-none">没有相关数据</div>
                -->
            </dl>
            <div class="fly-panel">
                <div class="fly-panel-title">
                    特别鸣谢
                </div>
                <div class="fly-panel-main">
                    <a href="http://geek5.cn/" target="_blank" class="fly-zanzhu" style="background-color: #393D49;">金牌讲师：余凯凯</a>
                </div>
            </div>

            <div class="fly-panel fly-link">
                <h3 class="fly-panel-title">友情链接</h3>
                <dl class="fly-panel-main">
                    <dd><a href="http://geek5.cn/" target="_blank">geek5.cn</a><dd>
                    <dd><a href="mailto:xianxin@layui-inc.com?subject=%E7%94%B3%E8%AF%B7Fly%E7%A4%BE%E5%8C%BA%E5%8F%8B%E9%93%BE" class="fly-link">申请友链</a><dd>
                </dl>
            </div>
            <div class="fly-panel" style="padding: 20px 0; text-align: center;">
                <img src="/fly-3.0/res/images/weixinL.jpg" style="max-width: 100%;" alt="layui">
                <p style="position: relative; color: #666;">微信扫码添加好友</p>
            </div>

        </div>
    </div>
</div>

<div class="fly-footer">
    <p><a href="http://fly.layui.com/" target="_blank">明日社区</a> 2019 &copy; <a href="http://www.layui.com/" target="_blank">星期三</a></p>
    <p>
        <a href="http://fly.layui.com/jie/3147/" target="_blank">晚上三点</a>
        <a href="http://www.layui.com/template/fly/" target="_blank">薇果</a>
        <a href="http://fly.layui.com/jie/2461/" target="_blank">微信公众号</a>
    </p>

</div>

<script src="/fly-3.0/res/layui/layui.js"></script>
<script>
    function go(num) {
        var pn=document.getElementsByName("pageNum")[0];
        if(pn){
            pn.value=num;
        }
        var fm=document.getElementsByTagName("form")[0];
        if(fm){
            fm.submit();
        }
    }



    layui.cache.page = 'jie';
    layui.cache.user = {
        username: '游客'
        ,uid: -1
        ,avatar: '/fly-3.0/res/images/avatar/00.jpg'
        ,experience: 83
        ,sex: '男'
    };
    layui.config({
        version: "3.0.0"
        ,base: '/fly-3.0/res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');
</script>
<form action="/fronts" method="post">
    <input type="hidden" name="pageNum" >
</form>
</body>
</html>