<%--
  Created by IntelliJ IDEA.
  User: lipengpeng
  Date: 2019/6/11
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="page">
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
</script>
    <div>
        <a href="javascript:go(1);" class="prev">&lt;&lt;</a>
        <c:forEach items="${p.numList}" var="item">
            <c:if test="${item==p.pageNum}">
                <span class="current">${item}</span>
            </c:if>
            <c:if test="${item!=p.pageNum}">
                <a href="javascript:go(${item});" class="num">${item} </a>
            </c:if>
        </c:forEach>
        <a href="javascript:go(${p.totalPage});" class="next">&gt;&gt;</a>
    </div>
</div>


</body>
</html>
