<%--
  Created by IntelliJ IDEA.
  User: yeqifu
  Date: 2020/10/5
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h3>访问成功！</h3><br>
request域中的数据：${requestScope.get("msg")}<br>
session域中的数据：${sessionScope.get("msg")}--${sessionScope.info}<br>
pageContext域中的数据：${pageScope.msg}<br>
application域中的数据：${applicationScope.get("msg")}<br>
</body>
</html>
