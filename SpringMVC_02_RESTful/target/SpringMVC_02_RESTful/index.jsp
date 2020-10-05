<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC_RESTful</title>
</head>
<body>
<%--
    发起图书的增删改查请求：使用Rest风格的URL地址
    book/1  GET:查询1号图书
    book/1  DELETE:删除1号图书
    book/1  PUT:更新1号图书
    book/1  POST:添加1号图书

    从页面发起PUT、DELETE形式的请求?Spring提供了对Rest风格的支持
    1、SpringMVC中有一个Filter，他可以把普通的请求转化为规定的请求，配置这个filter
    2、如何发其它形式的请求?
        2.1、创建一个post类型的表单
        2.2、表单项中携带一个_method的参数
        2.3、这个_method的值就是DELETE、PUT
--%>
<a href="book/1">查询1号图书</a>
<form action="book/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="删除1号图书">
</form>
<form action="book" method="post">
    <input type="submit" value="添加图书">
</form>
<form action="book/1" method="post">
    <input name="_method" value="PUT">
    <input type="submit" value="更新1号图书">
</form>
</body>
</html>

