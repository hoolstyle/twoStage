<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 86561
  Date: 2019/6/17
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Fly Template v3.0，基于 layui 的极简社区页面模版</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
    <link rel="stylesheet" href="/fly-3.0/res/layui/css/layui.css">
    <link rel="stylesheet" href="/fly-3.0/res/css/global.css">
    <script type="text/javascript" src="/fly-3.0/js/jquery-3.3.1.min.js"></script>
</head>
<body>

<div class="fly-header layui-bg-black">
    <div class="layui-container">
        <a class="fly-logo" href="fronts">
            <img src="/fly-3.0/res/images/logo.png" alt="layui">
        </a>
        <ul class="layui-nav fly-nav layui-hide-xs">
            <li class="layui-nav-item layui-this">
                <a href="/"><i class="iconfont icon-jiaoliu"></i>交流</a>
            </li>
        </ul>

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

<div class="layui-hide-xs">
    <div class="fly-panel fly-column">
        <div class="layui-container">
            <ul class="layui-clear">
                <li class="layui-hide-xs"><a href="fronts">首页</a></li>
                <li class="layui-this"><a href="">提问</a></li>
                <li><a href="">动态<span class="layui-badge-dot"></span></a></li>
                <li><a href="">公告</a></li>
                <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li>

                <!-- 用户登入后显示 -->
                <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="/fly-3.0/html/user/index.html">我发表的贴</a></li>
                <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="/fly-3.0/html/user/index.html#collection">我收藏的贴</a></li>
            </ul>

            <div class="fly-column-right layui-hide-xs">
                <span class="fly-search"><i class="layui-icon"></i></span>
                <a href="frontsR" class="layui-btn">发表新帖</a>
            </div>
            <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;">
                <a href="frontsR" class="layui-btn">发表新帖</a>
            </div>
        </div>
    </div>
</div>

<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8 content detail">
            <div class="fly-panel detail-box">
                <h1>${pos.postscontent}</h1>
                <div class="fly-detail-info">
                    <!-- <span class="layui-badge">审核中</span> -->

                    <span class="fly-list-nums">
            <a href="#comment"><i class="iconfont" title="回答">&#xe60c;</i> ${pos.commentid}</a>
            <i class="iconfont" title="人气">&#xe60b;</i> ${pos.postsheat}
          </span>
                </div>
                <c:if test="${pos.picture != null}">
                <div ><img src="${pos.picture}" style="width: 250px; height: 250px;"></div>
                </c:if>
            </div>

            <div class="fly-panel detail-box" id="flyReply">
                <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
                    <legend>回帖</legend>
                </fieldset>

                <ul class="jieda" id="jieda">
                    <c:forEach items="${lis}" var="item" varStatus="S">
                    <li data-id="111" class="jieda-daan">
                        <a name="item-1111111111"></a>
                        <div class="detail-about detail-about-reply">
                            <a class="fly-avatar" href="">
                                <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" alt=" ">
                            </a>
                            <div class="fly-detail-user">
                                <a href="" class="fly-link">
                                    <cite>${item.posts.user.userName}</cite>
                                    <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                                    <i class="layui-badge fly-badge-vip">VIP3</i>
                                </a>
                                <c:if test="${S.last}">
                                    <span>(楼主)</span>
                                </c:if>

                                <!--
                                <span style="color:#5FB878">(管理员)</span>
                                <span style="color:#FF9E3F">（社区之光）</span>
                                <span style="color:#999">（该号已被封）</span>
                                -->
                            </div>

                            <div class="detail-hits">
                                <span><fmt:formatDate value="${item.cmtime}" pattern="yyyy-MM-dd HH:mm:ss"/> </span>
                            </div>

                        </div>
                        <div class="detail-body jieda-body photos">
                            <p>${item.cmcontent}</p>
                        </div>
                        <div class="jieda-reply">
              <span class="jieda-zan zanok" type="zan">
                <i class="iconfont icon-zan"></i>
                <em>${item.posts.commentid}</em>
              </span>
                            <span type="reply">
                <i class="iconfont icon-svgmoban53"></i>
                回复
              </span>
                        </div>
                    </li>
                    </c:forEach>
                    <!-- 无数据时 -->
                    <!-- <li class="fly-none">消灭零回复</li> -->
                </ul>

                <div class="layui-form layui-form-pane">
                    <form action="/reply" method="post">
                        <div class="layui-form-item layui-form-text">
                            <a name="comment"></a>
                            <div class="layui-input-block">
                                <textarea id="L_content"  name="cmcontent" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <input type="hidden" name="postsid" value="${pos.postsid}">
                            <button id="btns" onclick="go(${pos.postsid})" class="layui-btn" lay-filter="*" lay-submit>提交回复</button>
                        </div>
                    </form>
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
                    <a href="http://layim.layui.com/?from=fly" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">思诚人：秀芳姐</a>
                </div>
            </div>

            <div class="fly-panel" style="padding: 20px 0; text-align: center;">
                <img src="/fly-3.0/res/images/weixinL.jpg" style="max-width: 100%;" alt="layui">
                <p style="position: relative; color: #666;">微信扫码添加好友</p>
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
<script>
    function go(value) {
        $.ajax({
            url:"/frontsWs/"+value,
            type:"post",
            dataType:"json",
            success:function(r){
                if (r==1){
                    layer.alert("评论成功", {icon: 6},function () {
                        parent.location.reload();
                    });
                } else {
                    layer.alert("评论失败",{icon:5})
                }
            }
        })
        return false;
    }
</script>

</body>
</html>
