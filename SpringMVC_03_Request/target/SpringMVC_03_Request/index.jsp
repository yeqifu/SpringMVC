<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="handle1?username=luoyi-">handle1</a>
<br>
<form action="book" method="post">
    书名：<input type="text" name="bookName"><br>
    价格：<input type="text" name="price"><br>
    作者：<input type="text" name="author"><br>
    库存：<input type="text" name="stock"><br>
    销量：<input type="text" name="sales"><br>
    省份：<input type="text" name="address.province"><br>
    城市：<input type="text" name="address.city"><br>
    街道：<input type="text" name="address.street"><br>
    <input type="submit" value="添加"><br>
</form>
<br>
<a href="handle2">SpringMVC可以直接在参数上写原生的API</a>
</body>
</html>
